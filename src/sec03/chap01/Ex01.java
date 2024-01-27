package sec03.chap01;

public class Ex01 {
    public static void main(String[] args) {

        byte    _1b_byte = 1;
        short   _2b_short = 2;
        int     _4b_int = 3; // ⭐️ 일반적으로 널리 사용
        // int인 4가 묵시적 형 변환으로 들어가 있는 것
        // L이 안 붙으면 long이 아님
        long    _8b_long = 4;

        //  ⚠️ 자료형의 범주 외의 수를 담을 수 없음
        byte overByte1 = 127;
//        byte overByte2 = 128;
        byte overByte3 = -128;
//        byte overByte4 = -129;

        // 큰 자료형에 작은 자료형의 값을 넣을 수 있음
        //  💡 묵시적(암시적) 형변환 : 더 큰 변수로의 형변환은 묵시적으로 가능
        // byte였던 1이 short 변수의 값으로 들어가면서
        // short 자료형의 1로 바뀜
        // (값은 동일하지만 담기는 통의 크기가 달라짐)
        _2b_short = _1b_byte;
        _4b_int = _1b_byte; _4b_int = _2b_short;
        _8b_long = _1b_byte; _8b_long = _2b_short; _8b_long = _4b_int;

        //  ⚠️ 작은 자료형에 큰 자료형의 값을 '그냥' 넣을 수 없음
        //  들어있는 값의 크기와 무관
//        _1b_byte = _2b_short; _1b_byte = _4b_int; _1b_byte = _8b_long;
//        _2b_short = _4b_int; _2b_short = _8b_long;
//        _4b_int = _8b_long;

        //  ⭐ int의 범위를 벗어나는 수에는 리터럴에도 명시 필요
        //  끝에 l 또는 L을 붙여 볼 것
        long _8b_long1 = 123456789123456789L;

        //  💡 가독성을 위해 아래와 같이 표현 가능 (자바7부터)
        int _4b_int2 = 123_456_789;
        long _8b_long2 = 123_456_789_123_456_789L;


    }
}
