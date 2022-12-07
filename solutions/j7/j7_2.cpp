#include <fstream>
#include <iostream>
#include <vector>
#include <stack>

constexpr uint BUFF = 32;
constexpr uint TOTAL_SPACE = 70000000;
constexpr uint SPACE_NEEDED = 30000000;

class Component {
private:
    std::string name;

public:
    Component(std::string name): name(name) {}
    virtual ~Component() = default;

    virtual std::string getName() const {return name;}
    virtual int getSize() const = 0;
};

class File: public Component {
private:
    int size;

public:
    File(std::string name, int size): Component(name), size(size) {}

    int getSize() const override {return size;}
};

class Directory: public Component{
private:
    Directory* parent;
    std::vector<Component*> components;

public:
    Directory(std::string name, Directory* parent): Component(name), parent(parent) {}

    ~Directory() {
        for (auto& component: components) {
            delete component;
        }
    }

    std::vector<Component*> getComponents() const {return components;}
    Directory* getParent() const {return parent;}

    void addComponent(Component *component) {
        components.push_back(component);
    }

    int getSize() const override {
        int size = 0;
        for (auto& component: components) {
            size += component->getSize();
        }
        return size;
    }

    Component* getComponent(std::string name) {
        for (auto& component: components) {
            if (component->getName() == name) {
                return component;
            }
        }
        return nullptr;
    }


};

int main() {
    std::ifstream file("../../input/j7.txt");

    if (file) {
        std::string line;

        std::vector<Directory*> dirs;
        int size = 0;
        std::string name;
        char param[BUFF] = {0};

        Directory* root = new Directory("/", nullptr);
        dirs.push_back(root);
        Directory* current = nullptr;

        while(getline(file, line)){
            if (sscanf(line.c_str(), "$ cd %s", param) == 1) {
                name = param;
                if(name == "..") {
                    current = current->getParent();
                }
                else if (name == "/") {
                    current = root;
                }
                else {
                    current = dynamic_cast<Directory*>(current->getComponent(name));
                }
            }
            else if (sscanf(line.c_str(), "dir %s", param) == 1) {
                name = param;
                Directory *dir = new Directory(name, current);
                current->addComponent(dir);
                dirs.push_back(dir);
            }
            else if (sscanf(line.c_str(), "%d %s", &size, param) == 2) {
                name = param;
                current->addComponent(new File(name, size));
            }
        }

        const uint unused_space = TOTAL_SPACE - root->getSize();

        if (file.eof()) {
            uint min_delete = root->getSize();

            for (auto& dir: dirs) {
                if (dir->getSize() + unused_space >= SPACE_NEEDED && dir->getSize() < min_delete) {
                    min_delete = dir->getSize();
                }
            }
            printf("Size of directory to delete : %u\n", min_delete);
            delete root;
        }
        else {
            std::cerr<<"Error reading file content\n";
        }
    }
    else {
        std::cerr<<"Error opening file\n";
    }
}
