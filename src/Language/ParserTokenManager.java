/* ParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
/* 1. Package e importaciones */
package Language;
import java.util.ArrayList;
import Classes.Abstracts.*;
import Classes.Expressions.*;
import Classes.Instructions.*;
import Classes.Utils.IDValue;
import Classes.Utils.InitializeFor;
import Classes.Utils.Parameter;
import Classes.Utils.Type;
import Classes.Utils.TypeError;
import Classes.Utils.Outs;

/** Token Manager. */
@SuppressWarnings ("unused")
public class ParserTokenManager implements ParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400000000L) != 0L)
            return 13;
         if ((active0 & 0x3ffffeL) != 0L)
         {
            jjmatchedKind = 26;
            return 12;
         }
         return -1;
      case 1:
         if ((active0 & 0x1180L) != 0L)
            return 12;
         if ((active0 & 0x3fee7eL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 1;
            }
            return 12;
         }
         return -1;
      case 2:
         if ((active0 & 0x440L) != 0L)
            return 12;
         if ((active0 & 0x3feabeL) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 2;
            return 12;
         }
         return -1;
      case 3:
         if ((active0 & 0x84226L) != 0L)
            return 12;
         if ((active0 & 0x37a898L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
            return 12;
         }
         return -1;
      case 4:
         if ((active0 & 0x310800L) != 0L)
            return 12;
         if ((active0 & 0x6a098L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
            return 12;
         }
         return -1;
      case 5:
         if ((active0 & 0x28010L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 5;
            return 12;
         }
         if ((active0 & 0x42088L) != 0L)
            return 12;
         return -1;
      case 6:
         if ((active0 & 0x8010L) != 0L)
            return 12;
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 6;
            return 12;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
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
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 37:
         return jjStopAtPos(0, 35);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 40:
         return jjStopAtPos(0, 46);
      case 41:
         return jjStopAtPos(0, 47);
      case 42:
         return jjStopAtPos(0, 33);
      case 43:
         jjmatchedKind = 31;
         return jjMoveStringLiteralDfa1_0(0x28000000L);
      case 44:
         return jjStopAtPos(0, 50);
      case 45:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x50000000L);
      case 47:
         return jjStartNfaWithStates_0(0, 34, 13);
      case 58:
         return jjStopAtPos(0, 51);
      case 59:
         return jjStopAtPos(0, 52);
      case 60:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 61:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 62:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 63:
         return jjStopAtPos(0, 53);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x8L);
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
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 123:
         return jjStopAtPos(0, 48);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 125:
         return jjStopAtPos(0, 49);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(1, 43);
         break;
      case 43:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 45:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         break;
      case 61:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x104002L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x48000L);
      case 102:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 12);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x820L);
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
         return jjMoveStringLiteralDfa2_0(active0, 0x20494L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x290000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 124:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
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
         return jjMoveStringLiteralDfa3_0(active0, 0x202806L);
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
         return jjMoveStringLiteralDfa3_0(active0, 0x4200L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 12);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80080L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
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
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x810L);
      case 110:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 12);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
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
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
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
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 12);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
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
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 12);
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(6, 4, 12);
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
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
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
   return jjStartNfa_0(6, active0);
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
                     if (kind > 58)
                        kind = 58;
                     { jjCheckNAdd(14); }
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
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
                  if (curChar == 39 && kind > 22)
                     kind = 22;
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
                  if (curChar == 34 && kind > 23)
                     kind = 23;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
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
                  if (curChar == 47 && kind > 59)
                     kind = 59;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  { jjCheckNAddStates(0, 2); }
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
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
                  if (kind > 25)
                     kind = 25;
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
                     if (kind > 26)
                        kind = 26;
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
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAdd(12); }
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAdd(12); }
                  break;
               case 14:
                  if (kind > 58)
                     kind = 58;
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
                  if (kind > 58)
                     kind = 58;
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
"\160\162\151\156\164", null, null, null, null, null, "\53\53", "\55\55", "\53\75", "\55\75", "\53", 
"\55", "\52", "\57", "\45", "\75\75", "\41\75", "\74\75", "\76\75", "\75", "\74", 
"\76", "\46\46", "\174\174", "\41", "\50", "\51", "\173", "\175", "\54", "\72", 
"\73", "\77", null, null, null, null, null, null, null, };
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
   if (jjmatchedPos == 0 && jjmatchedKind > 60)
   {
      jjmatchedKind = 60;
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
      case 60 :
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
      case 22 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                  matchedToken.image = matchedToken.image.substring(1, matchedToken.image.length() - 1);
         break;
      case 23 :
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
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fffffffffffffL, 
};
static final long[] jjtoSkip = {
   0x1fc0000000000000L, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
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
