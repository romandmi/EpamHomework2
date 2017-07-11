package homework170704.codingbatarrays;


public class Arrays1Solutions {

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 | nums[nums.length -1] == 6 ;

    }

    public int[] reverse3(int[] nums) {
        int [] array = new int [3];
        int j = 0;
        for (int i = 2; i >= 0; i--) {
            array[j] = nums[i];
            j++;
        }
        return array;
    }

    public int[] middleWay(int[] a, int[] b) {
        int [] array = new int [2];
        array [0] = a [1];
        array [1] = b [1];
        return array;

    }

    public boolean no23(int[] nums) {
        if ( nums[0] != 2 & nums[0] != 3 & nums[1] != 2 & nums[1] != 3) {
            return true;
        }

        else
            return false;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if ( a [0] == b [0] ||  a[a.length -1] ==  b[b.length -1]) {
            return true;
        }

         else
             return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if ( nums.length >= 1 && nums[0] == nums [nums.length-1]) {
            return true;
        }

        else
            return false;
    }

    public int sum3(int[] nums) {
        int summ = 0;
        return  summ = nums[0] + nums[1] + nums[2];
    }

    public int[] makeEnds(int[] nums) {
        int [] a = new int [2];
        if (nums.length >= 1) {
    a [0] = nums[0];
    a [1] = nums[nums.length - 1];
        }
        return a;
    }

    public int[] fix23(int[] nums) {
        if ( nums[0] == 2 & nums[1] == 3){
            nums[1] = 0;
            return nums;
        }

        if (nums[1] == 2 & nums[2] ==3) {
            nums[2] = 0;
            return nums;
        }

        else return nums;
    }

    public int[] maxEnd3(int[] nums) {

        if (nums[0] > nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
            return nums;
        }

        if (nums[2] > nums[0]) {
            nums[0] = nums[2];
            nums[1] = nums[2];
            return nums;
        }

        if (nums[0] == nums[2]) {
            nums[1] = nums[0];
        }
        return nums;
    }

    public int[] makePi() {
        int a []  = {3,1,4};
        return a;
    }

    public int[] rotateLeft3(int[] nums) {
        int [] nums2 = new int[3];
        nums2[0] = nums[1];
        nums2[1] = nums[2];
        nums2[2] = nums[0];
        return nums2;
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            int a = nums[0] + nums[1];
            return a;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        else return 0;
    }

    public boolean has23(int[] nums) {
        if ( nums[0] == 2 || nums[1] == 3 | nums[0] == 3 || nums[1] == 2) {
            return true; }


        else return false;
    }

    public boolean double23(int[] nums) {
        if ( nums.length < 2) {
            return false;
        }

        if (nums[0] == 2 & nums[1] == 2 || nums[0] == 3 & nums[1] == 3){
            return true;
        }

        else return false;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int a1 = a[0] + a[1];
        int b1 = b[0] + b[1];
        if (a1 > b1) return a;
        if (a1 == b1) return a;
        else return b;
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length >= 1) {
            int a = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = a;
        }
        return nums;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length > 1) {
            int [] nums1 = new int[2];
            nums1[0] = nums[0];
            nums1[1] = nums[1];
            return nums1;
        }

        if (nums.length == 1){
            int [] nums2 = new int[1];
            nums2[0] = nums[0];
            return nums2;
        }
        else return nums;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 & b.length > 0) {
            int [] nums = {a[0],b[0]};
            return nums;
        }

        if (a.length == 0 & b.length == 0) {
            int [] nums = new int[0];
            return nums;
        }

        if (a.length == 0) {
            int [] nums ={b[0]};
            return nums;
        }

        if (b.length == 0) {
            int [] nums ={a[0]};
            return nums;
        }

        else return b;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int [] ab = {a[0],a[1],b[0],b[1]};
        return ab;
    }

    public int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        if (nums[mid] > nums[nums.length - 1] & nums[mid] > nums[0]) {
            return nums[mid];
        }
        if (nums[mid] < nums[nums.length - 1] & nums[nums.length - 1] > nums[0]) {
            return nums[nums.length - 1];
        }

        else return nums[0];

    }

    public int diff21(int n) {
        if (n > 21) {
            int a = 21 - n;
            return a * 2;
        }

        int b = 21 - n;
        return b;
    }


}
