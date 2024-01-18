package _03_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 변수 선언
        // - 두 가지 방법이 있으나 관례적으로 첫 번째 방법 사용
        // 1. 타입[] 변수;
        // 2. 타입 변수[];;

//        int[] arr1;
//        int arr2[];

        // - 배열 변수는 "참조 변수". 배열도 객체이므로 힙 영역에 생성되고, 배열 변수는 힙 영역의 주소를 저장
        // 1. 저장 가능(null로 초기화)
        // ex. 타입[] 변수 = null;
        // => 배열 변수가 null 값을 가진 상태에서는 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPointerEx
//        String[] temp = null;
        //System.out.println(temp);

        // - 값 목록으로 배열 변수 선언과 배열 생성
//        int[] intArray = {16, 22, 34, 41, 59};
//        System.out.println(intArray[0]);
//
//        intArray[1] = 77;
//        System.out.println(intArray[1]);

        // 주의. 중괄호로 감싼 목록을 배열 변수에 대입할 때, 배열 변수 미리 선언한 수에는 값 목록을 변수에 대입
//        char[] charArray;
        // charArray = {'A', 'B', 'C'}; // 컴파일 에러
        // 배열 변수 선언 시점과, 값 목록 대입하는 시점이 다르다면 "new 타입[]"을 중괄호 앞에 붙여서 대입
//        charArray = new char[]{'A', 'B', 'C'};
//        System.out.println(charArray[0]);
//
//        double[] doubleArray = new double[3];
//        doubleArray[0] = 0.1;
//        System.out.println("new 연산자로 초기화된 값: " + doubleArray[0]);

        // 배열 길이
        // - 배열변수.length;
        // - length 필드는 읽기만 가능, 값 변경 불가능
//        System.out.println(doubleArray.length);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("5개의 정수를 입력하세여");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//        System.out.println((double)((a+b+c+d+e)/5));

//        Scanner scanner = new Scanner(System.in);
//        int[] no = new int[5];
////        System.out.println("정수 5개를 입력해주세요");
//
//        // 숫자 다섯개 입력받기
//        for (int i = 0; i < no.length; i++) {
//            no[i] = scanner.nextInt();
//        }
//
//        int sum = 0;
//        for(int n : no){
//            sum = sum + n;
//        }
////        System.out.println((double)(sum/no.length));

        // - 배열 길이를 벗어난다면?
        //System.out.println(doubleArray[doubleArray.length]); 에러남:ArrayIndexOutOfBoundsException

        // 배열  출력
        // - toString(): 배열 내용을 문자열로 변환하여 반환
        // - 배열 이름으로 배열 주소값이 아닌 배열 내부 값을 모두 보고싶을 때
//        System.out.println("intArray: " + Arrays.toString(intArray));
//        System.out.println("charArray: " + Arrays.toString(charArray));
//        System.out.println("doubleArray: " + Arrays.toString(doubleArray));

        // 다차원 배열
        // - 배열 안에 또 다른 배열이 존재하는 배열
        // 2 * 3 배열 생성 및 초기화
        int[][] matrix = {{1,2,3}, {4,5,6}};

        // 3 * 2 배열 생성 및 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 1;
        matrix2[2][0] = 2;
        matrix2[2][1] = 3;

        // 3차원 배열 생성 및 초기화
        int[][][] threeDimension = {{{1,2}, {2,4}, {7,8}, {9,5}}};
        System.out.println("matrix");
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                //(0,0), (0,1), (0,2)
                //(1,0), (1,1), (1,2)
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // 배열 복사
        // - 배열은 크기가 고정
        // -> 더 많은 저장 공간이 필요하다면 더 큰 길이의 배열을 새로 만들어서 기존 배열을 복사

        // ver1. 반복문으로 요소 하나씩 복사
        int[] originArray = {1,2,3};
        int[] newArray = new int[5];
        for (int i = 0; i < originArray.length; i++) {
            newArray[i] = originArray[i];
        }

        // ver2. arraycopy() 사용
        // : System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)l
        // - Object src: 원본 배열
        // - int srcPos : 원본 배열 복사 시작 인덱스
        // - Object dest : 새 배열
        // - int destPos : 새 배열 붙여넣기 시작할 인덱스
        // - int length : 복사 항목 수

        String[] originFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

        System.arraycopy(originFruits, 0, newFruits, 0, originFruits.length);
        System.out.println(Arrays.toString(newFruits));

        // Arrays 메소드
        // copyOf(arr, copyArrayLength) 메소드
        int[] originalArray = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originalArray, 3);
        System.out.println("OriginalArray" + Arrays.toString(originalArray));
        System.out.println("copiedArray" + Arrays.toString(copiedArray));

        // copyOfRange(arr, sIdx, eIdx) 메소드
        int[] rangeArray = Arrays.copyOfRange(originalArray, 1, 4);
        System.out.println("rangeArray" + Arrays.toString(rangeArray)); //[2,3,4]

        // fill(arr, n) 메소드
        int[] filledArray = new int[5];
        System.out.println("filledArray (before): " + Arrays.toString(filledArray)); //[0, 0, 0, 0, 0]
        Arrays.fill(filledArray, 7);
        System.out.println("filledArray (before): " + Arrays.toString(filledArray)); //[7, 7, 7, 7, 7]

        // sort(arr) 메소드
        int[] unsortedArray = {5, 3, 1, 7, 9};
        Arrays.sort(unsortedArray);
        System.out.println("sortedArray" + Arrays.toString(unsortedArray));

        // equals(arr1, arr2) 메소드
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {2,5,9};

        boolean arraysEqual = Arrays.equals(array1, array2);
        boolean arrayEqual1 = Arrays.equals(array1, array3);

        System.out.println("arraysEqual: "+arraysEqual); //true
        System.out.println("arraysEqual1: "+arrayEqual1); //false
         
        // == 비교
        System.out.println("array2 == array1: "+ (array2 == array1)); //false
        
        // deepEquals(arr1, arr2) 메소드 : 다차원일때 사용
        int[][] deepArray1 = {{1,2}, {5,9}};
        int[][] deepArray2 = {{1,2}, {5,9}};
        int[][] deepArray3 = {{7,3}, {5,9}};

        boolean deepArraysEqual1 = Arrays.deepEquals(deepArray1, deepArray2);
        boolean deepArraysEqual2 = Arrays.deepEquals(deepArray3, deepArray2);
        System.out.println("deepArraysEqual" + deepArraysEqual1); //true
        System.out.println("deepArraysEqual" + deepArraysEqual2); //false

        // binarySearch(arr, val) 메소드(단, 배열은 정렬된 상태여야 함)
        int[] sortedArray = {10, 30, 50, 90, 20};
        int index = Arrays.binarySearch(sortedArray, 10);
        System.out.println("index of 10: " + index);

    }
}