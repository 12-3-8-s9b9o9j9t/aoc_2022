grammar monkey;

@lexer::header{
package output;
}

@parser::header{
package output;

import main.Monkey;
}

monkeys
    :	monkey+ EOF;
    
monkey
    :	'Monkey' INT ':' {Monkey m = new Monkey();}
    	items[m]
    	op[m]
    	test[m];

items [Monkey m]
    :	'Starting items:' i=INT {m.addItem(Long.valueOf($i.text));}
    	(',' i=INT {m.addItem(Long.valueOf($i.text));})*;

op [Monkey m]
    :	'Operation: new = old'{Long tmp = null;}
    	operator=OP
    	('old' | x=INT {tmp = Long.valueOf($x.text);})
    	{m.setOp($operator.text, tmp);};

test [Monkey m]
    :	'Test: divisible by' div=INT t=yes f=no {m.setTest(Integer.valueOf($div.text), $t.m, $f.m);};

yes returns [int m]
    :	'If true: throw to monkey' tmp=INT {$m = Integer.valueOf($tmp.text);};

no returns [int m]
    :	'If false: throw to monkey' tmp=INT {$m = Integer.valueOf($tmp.text);};

OP  :	'+' | '*';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

