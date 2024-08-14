/* ParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
/* 1. Package e importaciones */
package Language;
import java.util.ArrayList;
import Classes.Abstracts.*;
import Classes.Expressions.*;
import Classes.Instructions.*;
import Classes.Utils.DataType;
import Classes.Utils.IDPos;
import Classes.Utils.IDValue;
import Classes.Utils.InitializeFor;
import Classes.Utils.Outs;
import Classes.Utils.Parameter;
import Classes.Utils.Type;
import Classes.Utils.TypeError;

/** Token Manager. */
@SuppressWarnings ("unused")
public class ParserTokenManager implements ParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x21000000000L) != 0L)
            return 13;
         if ((active0 & 0x3fffffeL) != 0L)
         {
            jjmatchedKind = 30;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0x1180L) != 0L)
            return 12;
         if ((active0 & 0x3ffee7eL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 30;
               jjmatchedPos = 1;
            }
            return 12;
         }
         return -1;
      case 2:
         if ((active0 & 0x2000440L) != 0L)
            return 12;
         if ((active0 & 0x1ffeabeL) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
            return 12;
         }
         return -1;
      case 3:
         if ((active0 & 0x1084226L) != 0L)
            return 12;
         if ((active0 & 0xf7a898L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 3;
            return 12;
         }
         return -1;
      case 4:
         if ((active0 & 0xf10800L) != 0L)
            return 12;
         if ((active0 & 0x6a098L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 30;
               jjmatchedPos = 4;
            }
            return 12;
         }
         return -1;
      case 5:
         if ((active0 & 0x42088L) != 0L)
            return 12;
         if ((active0 & 0x228010L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 5;
            return 12;
         }
         return -1;
      case 6:
         if ((active0 & 0x208010L) != 0L)
            return 12;
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 6;
            return 12;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 37:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 40:
         return jjStopAtPos(0, 53);
      case 41:
         return jjStopAtPos(0, 54);
      case 42:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 43:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x280000000L);
      case 44:
         return jjStopAtPos(0, 60);
      case 45:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x500000000L);
      case 46:
         return jjStopAtPos(0, 59);
      case 47:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 58:
         return jjStopAtPos(0, 61);
      case 59:
         return jjStopAtPos(0, 62);
      case 60:
         jjmatchedKind = 48;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 61:
         jjmatchedKind = 47;
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 62:
         jjmatchedKind = 49;
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 63:
         return jjStopAtPos(0, 63);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x8L);
      case 91:
         return jjStopAtPos(0, 57);
      case 93:
         return jjStopAtPos(0, 58);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10010L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x24020L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x9080L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100400L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x600000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x840000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x1002000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 123:
         return jjStopAtPos(0, 55);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000000000L);
      case 125:
         return jjStopAtPos(0, 56);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         break;
      case 43:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 45:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 61:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(1, 46);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x104002L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x48000L);
      case 102:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 12);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x820L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 111:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x820494L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x690000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 124:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x602806L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 114:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x8L);
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x4200L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x880080L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x18000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 100:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 2, 12);
         break;
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 12);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 12);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 12);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 12);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x810L);
      case 110:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0xe00000L);
      case 114:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 12);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x22000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 100:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 12);
         break;
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 12);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 107:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 12);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 12);
         break;
      case 103:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(5, 3, 12);
         break;
      case 104:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(5, 13, 12);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x208000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 12);
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(6, 4, 12);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 12);
         break;
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 12);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 12);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 28;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 13:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(18, 19); }
                  else if (curChar == 47)
                  {
                     if (kind > 68)
                        kind = 68;
                     { jjCheckNAdd(14); }
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     { jjCheckNAddStates(0, 2); }
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 17;
                  else if (curChar == 34)
                     { jjCheckNAddStates(3, 5); }
                  else if (curChar == 39)
                     { jjAddStates(6, 7); }
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 1:
                  if ((0xffffff7ffffffbffL & l) != 0L)
                     { jjCheckNAdd(2); }
                  break;
               case 2:
                  if (curChar == 39 && kind > 26)
                     kind = 26;
                  break;
               case 4:
                  { jjCheckNAdd(2); }
                  break;
               case 5:
                  if (curChar == 34)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 6:
                  if ((0xfffffffbfffffbffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 8:
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 9:
                  if (curChar == 34 && kind > 27)
                     kind = 27;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 68)
                     kind = 68;
                  { jjCheckNAdd(14); }
                  break;
               case 15:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 16:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(18, 19); }
                  break;
               case 18:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(18, 19); }
                  break;
               case 19:
                  if (curChar == 42)
                     { jjCheckNAddStates(8, 10); }
                  break;
               case 20:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(21, 19); }
                  break;
               case 21:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(21, 19); }
                  break;
               case 22:
                  if (curChar == 47 && kind > 69)
                     kind = 69;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  { jjCheckNAdd(24); }
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(25, 26); }
                  break;
               case 26:
                  if (curChar == 46)
                     { jjCheckNAdd(27); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  { jjCheckNAdd(27); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     { jjCheckNAdd(12); }
                  }
                  else if (curChar == 95)
                     { jjCheckNAddTwoStates(10, 11); }
                  break;
               case 1:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAdd(2); }
                  break;
               case 3:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  { jjCheckNAdd(2); }
                  break;
               case 6:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 7:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  { jjCheckNAddStates(3, 5); }
                  break;
               case 10:
                  if (curChar == 95)
                     { jjCheckNAddTwoStates(10, 11); }
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  { jjCheckNAdd(12); }
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  { jjCheckNAdd(12); }
                  break;
               case 14:
                  if (kind > 68)
                     kind = 68;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 18:
                  { jjCheckNAddTwoStates(18, 19); }
                  break;
               case 20:
               case 21:
                  { jjCheckNAddTwoStates(21, 19); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAdd(2); }
                  break;
               case 6:
               case 8:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddStates(3, 5); }
                  break;
               case 14:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 68)
                     kind = 68;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 18:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(18, 19); }
                  break;
               case 20:
               case 21:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjCheckNAddTwoStates(21, 19); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 28 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\155\141\151\156", "\166\157\151\144", "\123\164\162\151\156\147", 
"\142\157\157\154\145\141\156", "\143\150\141\162", "\151\156\164", "\144\157\165\142\154\145", "\151\146", 
"\145\154\163\145", "\146\157\162", "\167\150\151\154\145", "\144\157", 
"\163\167\151\164\143\150", "\143\141\163\145", "\144\145\146\141\165\154\164", "\142\162\145\141\153", 
"\143\157\156\164\151\156\165\145", "\162\145\164\165\162\156", "\164\162\165\145", "\146\141\154\163\145", 
"\160\162\151\156\164\154\156", "\160\162\151\156\164", "\162\157\165\156\144", "\163\151\172\145", 
"\141\142\163", null, null, null, null, null, "\53\53", "\55\55", "\53\75", "\55\75", 
"\52\75", "\57\75", "\45\75", "\53", "\55", "\52", "\57", "\45", "\75\75", "\41\75", 
"\74\75", "\76\75", "\75", "\74", "\76", "\46\46", "\174\174", "\41", "\50", "\51", 
"\173", "\175", "\133", "\135", "\56", "\54", "\72", "\73", "\77", null, null, null, 
null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   24, 25, 26, 6, 7, 9, 1, 3, 19, 20, 22, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 70)
   {
      jjmatchedKind = 70;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 70 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
             Outs.errors.add(Outs.newError(input_stream.line, input_stream.column, TypeError.LEXICAL, "Caracter no reconocido. \"" + image + "\""));
         break;
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                  matchedToken.image = matchedToken.image.substring(1, matchedToken.image.length() - 1);
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                  matchedToken.image = matchedToken.image.substring(1, matchedToken.image.length() - 1);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public ParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 28; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffffffffffffL, 0x0L, 
};
static final long[] jjtoSkip = {
   0x0L, 0x7fL, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[28];
    private final int[] jjstateSet = new int[2 * 28];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
