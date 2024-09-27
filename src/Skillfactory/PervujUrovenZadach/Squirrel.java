package Skillfactory.PervujUrovenZadach;

public class Squirrel {

    int[] nuts;

    Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    int getNuts(int index) {
        int getNuts = 0;
        getNuts = nuts[index];
        return getNuts;
    }


    int maxNuts() {
        int maxNuts = 0;
        int i;
        if (nuts.length == 1 && nuts[0] >0){
            maxNuts += nuts[0];
        }
        if (nuts.length != 1) {
            if (nuts[0] < 0 && nuts[0] > nuts[1]) {
                maxNuts += nuts[0];
            }
            if (nuts[nuts.length - 1] < 0 && nuts[nuts.length - 1] > nuts[nuts.length - 2]) {
                maxNuts += nuts[nuts.length - 1];
            }
            for (i = 0; i < nuts.length; i++) {
                if (getNuts(i) > 0) {
                    maxNuts += getNuts(i);
                }
            }
            for (i = 0; i < nuts.length - 1; i++) {
                if (getNuts(i) < 0 && getNuts(i) > getNuts(i + 1)) {
                    maxNuts += getNuts(i);
                }
            }
        }
        return maxNuts;
    }



    public static void main(String[] args) {
        Squirrel s = new Squirrel(new int[]{-2, -5, -3, -1, -5, -10, -1, -20, -2});
        System.out.println(s.maxNuts());
        Squirrel s2 = new Squirrel(new int[]{1, -2, 3, 1, -1, -4, 2, 3});
        System.out.println(s2.maxNuts());
        Squirrel s3 = new Squirrel(new int[]{-2});
        System.out.println(s3.maxNuts());
    }
}
