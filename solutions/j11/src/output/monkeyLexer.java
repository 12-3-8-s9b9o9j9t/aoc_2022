// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g 2022-12-11 19:33:00

package output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class monkeyLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int ID=4;
	public static final int INT=5;
	public static final int OP=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public monkeyLexer() {} 
	public monkeyLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public monkeyLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:6:6: ( ',' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:6:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:7:6: ( ':' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:7:8: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:8:7: ( 'If false: throw to monkey' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:8:9: 'If false: throw to monkey'
			{
			match("If false: throw to monkey"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:9:7: ( 'If true: throw to monkey' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:9:9: 'If true: throw to monkey'
			{
			match("If true: throw to monkey"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:10:7: ( 'Monkey' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:10:9: 'Monkey'
			{
			match("Monkey"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:11:7: ( 'Operation: new = old' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:11:9: 'Operation: new = old'
			{
			match("Operation: new = old"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:12:7: ( 'Starting items:' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:12:9: 'Starting items:'
			{
			match("Starting items:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:13:7: ( 'Test: divisible by' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:13:9: 'Test: divisible by'
			{
			match("Test: divisible by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:14:7: ( 'old' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:14:9: 'old'
			{
			match("old"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:40:5: ( '+' | '*' )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:42:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:42:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:42:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:45:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:45:7: ( '0' .. '9' )+
			{
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:45:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:48:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:48:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | OP | ID | INT | WS )
		int alt3=13;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt3=1;
			}
			break;
		case ':':
			{
			alt3=2;
			}
			break;
		case 'I':
			{
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='f') ) {
				int LA3_13 = input.LA(3);
				if ( (LA3_13==' ') ) {
					int LA3_19 = input.LA(4);
					if ( (LA3_19=='f') ) {
						alt3=3;
					}
					else if ( (LA3_19=='t') ) {
						alt3=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					alt3=11;
				}

			}

			else {
				alt3=11;
			}

			}
			break;
		case 'M':
			{
			int LA3_4 = input.LA(2);
			if ( (LA3_4=='o') ) {
				int LA3_14 = input.LA(3);
				if ( (LA3_14=='n') ) {
					int LA3_20 = input.LA(4);
					if ( (LA3_20=='k') ) {
						int LA3_27 = input.LA(5);
						if ( (LA3_27=='e') ) {
							int LA3_32 = input.LA(6);
							if ( (LA3_32=='y') ) {
								int LA3_36 = input.LA(7);
								if ( ((LA3_36 >= '0' && LA3_36 <= '9')||(LA3_36 >= 'A' && LA3_36 <= 'Z')||LA3_36=='_'||(LA3_36 >= 'a' && LA3_36 <= 'z')) ) {
									alt3=11;
								}

								else {
									alt3=5;
								}

							}

							else {
								alt3=11;
							}

						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

			}

			else {
				alt3=11;
			}

			}
			break;
		case 'O':
			{
			int LA3_5 = input.LA(2);
			if ( (LA3_5=='p') ) {
				int LA3_15 = input.LA(3);
				if ( (LA3_15=='e') ) {
					int LA3_21 = input.LA(4);
					if ( (LA3_21=='r') ) {
						int LA3_28 = input.LA(5);
						if ( (LA3_28=='a') ) {
							int LA3_33 = input.LA(6);
							if ( (LA3_33=='t') ) {
								int LA3_37 = input.LA(7);
								if ( (LA3_37=='i') ) {
									int LA3_40 = input.LA(8);
									if ( (LA3_40=='o') ) {
										int LA3_42 = input.LA(9);
										if ( (LA3_42=='n') ) {
											int LA3_44 = input.LA(10);
											if ( (LA3_44==':') ) {
												alt3=6;
											}

											else {
												alt3=11;
											}

										}

										else {
											alt3=11;
										}

									}

									else {
										alt3=11;
									}

								}

								else {
									alt3=11;
								}

							}

							else {
								alt3=11;
							}

						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

			}

			else {
				alt3=11;
			}

			}
			break;
		case 'S':
			{
			int LA3_6 = input.LA(2);
			if ( (LA3_6=='t') ) {
				int LA3_16 = input.LA(3);
				if ( (LA3_16=='a') ) {
					int LA3_22 = input.LA(4);
					if ( (LA3_22=='r') ) {
						int LA3_29 = input.LA(5);
						if ( (LA3_29=='t') ) {
							int LA3_34 = input.LA(6);
							if ( (LA3_34=='i') ) {
								int LA3_38 = input.LA(7);
								if ( (LA3_38=='n') ) {
									int LA3_41 = input.LA(8);
									if ( (LA3_41=='g') ) {
										int LA3_43 = input.LA(9);
										if ( (LA3_43==' ') ) {
											alt3=7;
										}

										else {
											alt3=11;
										}

									}

									else {
										alt3=11;
									}

								}

								else {
									alt3=11;
								}

							}

							else {
								alt3=11;
							}

						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

			}

			else {
				alt3=11;
			}

			}
			break;
		case 'T':
			{
			int LA3_7 = input.LA(2);
			if ( (LA3_7=='e') ) {
				int LA3_17 = input.LA(3);
				if ( (LA3_17=='s') ) {
					int LA3_23 = input.LA(4);
					if ( (LA3_23=='t') ) {
						int LA3_30 = input.LA(5);
						if ( (LA3_30==':') ) {
							alt3=8;
						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

			}

			else {
				alt3=11;
			}

			}
			break;
		case 'o':
			{
			int LA3_8 = input.LA(2);
			if ( (LA3_8=='l') ) {
				int LA3_18 = input.LA(3);
				if ( (LA3_18=='d') ) {
					int LA3_24 = input.LA(4);
					if ( ((LA3_24 >= '0' && LA3_24 <= '9')||(LA3_24 >= 'A' && LA3_24 <= 'Z')||LA3_24=='_'||(LA3_24 >= 'a' && LA3_24 <= 'z')) ) {
						alt3=11;
					}

					else {
						alt3=9;
					}

				}

				else {
					alt3=11;
				}

			}

			else {
				alt3=11;
			}

			}
			break;
		case '*':
		case '+':
			{
			alt3=10;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'L':
		case 'N':
		case 'P':
		case 'Q':
		case 'R':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=11;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=12;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=13;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:62: OP
				{
				mOP(); 

				}
				break;
			case 11 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:65: ID
				{
				mID(); 

				}
				break;
			case 12 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:68: INT
				{
				mINT(); 

				}
				break;
			case 13 :
				// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:1:72: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
