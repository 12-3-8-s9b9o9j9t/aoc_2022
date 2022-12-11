// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g 2022-12-11 23:39:14

package output;

import main.Monkey;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class monkeyParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "OP", "WS", "','", 
		"':'", "'If false: throw to monkey'", "'If true: throw to monkey'", "'Monkey'", 
		"'Operation: new = old'", "'Starting items:'", "'Test: divisible by'", 
		"'old'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public monkeyParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public monkeyParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return monkeyParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g"; }



	// $ANTLR start "monkeys"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:13:1: monkeys : ( monkey )+ EOF ;
	public final void monkeys() throws RecognitionException {
		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:14:5: ( ( monkey )+ EOF )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:14:7: ( monkey )+ EOF
			{
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:14:7: ( monkey )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==12) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:14:7: monkey
					{
					pushFollow(FOLLOW_monkey_in_monkeys30);
					monkey();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_monkeys33); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "monkeys"



	// $ANTLR start "monkey"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:16:1: monkey : 'Monkey' INT ':' items[m] op[m] test[m] ;
	public final void monkey() throws RecognitionException {
		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:17:5: ( 'Monkey' INT ':' items[m] op[m] test[m] )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:17:7: 'Monkey' INT ':' items[m] op[m] test[m]
			{
			match(input,12,FOLLOW_12_in_monkey49); 
			match(input,INT,FOLLOW_INT_in_monkey51); 
			match(input,9,FOLLOW_9_in_monkey53); 
			Monkey m = new Monkey();
			pushFollow(FOLLOW_items_in_monkey62);
			items(m);
			state._fsp--;

			pushFollow(FOLLOW_op_in_monkey70);
			op(m);
			state._fsp--;

			pushFollow(FOLLOW_test_in_monkey78);
			test(m);
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "monkey"



	// $ANTLR start "items"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:22:1: items[Monkey m] : 'Starting items:' i= INT ( ',' i= INT )* ;
	public final void items(Monkey m) throws RecognitionException {
		Token i=null;

		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:23:5: ( 'Starting items:' i= INT ( ',' i= INT )* )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:23:7: 'Starting items:' i= INT ( ',' i= INT )*
			{
			match(input,14,FOLLOW_14_in_items93); 
			i=(Token)match(input,INT,FOLLOW_INT_in_items97); 
			m.addItem(Long.valueOf((i!=null?i.getText():null)));
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:24:6: ( ',' i= INT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==8) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:24:7: ',' i= INT
					{
					match(input,8,FOLLOW_8_in_items107); 
					i=(Token)match(input,INT,FOLLOW_INT_in_items111); 
					m.addItem(Long.valueOf((i!=null?i.getText():null)));
					}
					break;

				default :
					break loop2;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "items"



	// $ANTLR start "op"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:26:1: op[Monkey m] : 'Operation: new = old' operator= OP ( 'old' |x= INT ) ;
	public final void op(Monkey m) throws RecognitionException {
		Token operator=null;
		Token x=null;

		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:27:5: ( 'Operation: new = old' operator= OP ( 'old' |x= INT ) )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:27:7: 'Operation: new = old' operator= OP ( 'old' |x= INT )
			{
			match(input,13,FOLLOW_13_in_op129); 
			Long tmp = null;
			operator=(Token)match(input,OP,FOLLOW_OP_in_op139); 
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:29:6: ( 'old' |x= INT )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==16) ) {
				alt3=1;
			}
			else if ( (LA3_0==INT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:29:7: 'old'
					{
					match(input,16,FOLLOW_16_in_op147); 
					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:29:15: x= INT
					{
					x=(Token)match(input,INT,FOLLOW_INT_in_op153); 
					tmp = Long.valueOf((x!=null?x.getText():null));
					}
					break;

			}

			m.setOp((operator!=null?operator.getText():null), tmp);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "op"



	// $ANTLR start "test"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:32:1: test[Monkey m] : 'Test: divisible by' div= INT t= yes f= no ;
	public final void test(Monkey m) throws RecognitionException {
		Token div=null;
		int t =0;
		int f =0;

		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:33:5: ( 'Test: divisible by' div= INT t= yes f= no )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:33:7: 'Test: divisible by' div= INT t= yes f= no
			{
			match(input,15,FOLLOW_15_in_test177); 
			div=(Token)match(input,INT,FOLLOW_INT_in_test181); 
			pushFollow(FOLLOW_yes_in_test185);
			t=yes();
			state._fsp--;

			pushFollow(FOLLOW_no_in_test189);
			f=no();
			state._fsp--;

			m.setTest(Integer.valueOf((div!=null?div.getText():null)), t, f);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "test"



	// $ANTLR start "yes"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:35:1: yes returns [int m] : 'If true: throw to monkey' tmp= INT ;
	public final int yes() throws RecognitionException {
		int m = 0;


		Token tmp=null;

		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:36:5: ( 'If true: throw to monkey' tmp= INT )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:36:7: 'If true: throw to monkey' tmp= INT
			{
			match(input,11,FOLLOW_11_in_yes207); 
			tmp=(Token)match(input,INT,FOLLOW_INT_in_yes211); 
			m = Integer.valueOf((tmp!=null?tmp.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return m;
	}
	// $ANTLR end "yes"



	// $ANTLR start "no"
	// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:38:1: no returns [int m] : 'If false: throw to monkey' tmp= INT ;
	public final int no() throws RecognitionException {
		int m = 0;


		Token tmp=null;

		try {
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:39:5: ( 'If false: throw to monkey' tmp= INT )
			// C:\\Users\\yanis\\Desktop\\AOC\\2022\\solutions\\j11\\src\\monkey.g:39:7: 'If false: throw to monkey' tmp= INT
			{
			match(input,10,FOLLOW_10_in_no229); 
			tmp=(Token)match(input,INT,FOLLOW_INT_in_no233); 
			m = Integer.valueOf((tmp!=null?tmp.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return m;
	}
	// $ANTLR end "no"

	// Delegated rules



	public static final BitSet FOLLOW_monkey_in_monkeys30 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EOF_in_monkeys33 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_monkey49 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_monkey51 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_monkey53 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_items_in_monkey62 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_op_in_monkey70 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_test_in_monkey78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_items93 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_items97 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_items107 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_items111 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_13_in_op129 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_OP_in_op139 = new BitSet(new long[]{0x0000000000010020L});
	public static final BitSet FOLLOW_16_in_op147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_op153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_test177 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_test181 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_yes_in_test185 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_no_in_test189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_yes207 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_yes211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_no229 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_no233 = new BitSet(new long[]{0x0000000000000002L});
}
