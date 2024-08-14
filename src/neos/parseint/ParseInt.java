package neos.parseint;

import java.util.ArrayList;
import java.util.Collections;

public class ParseInt {
    // Tìm kiếm và in ra vị trí của các số nguyên có giá trị bằng nhau trong mảng
    public void findDuplicates(ArrayList<Integer> arrayList) {
        ArrayList<Integer> processed = new ArrayList<>();

        System.out.println("Vị trí của các số nguyên có giá trị bằng nhau:");
        for (int i = 0; i < arrayList.size(); i++) {
            Integer value = arrayList.get(i);

            if ( !processed.contains(value) ) {
                ArrayList<Integer> positions = new ArrayList<>();
                positions.add(i);

                // tìm vị trí trùng nhau
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if ( arrayList.get(j).equals(value) ) {
                        positions.add(j);
                    }
                }

                // in giá trị xuất hiện nhiều hơn 1 lần
                if (positions.size() > 1) {
                    System.out.println(value + ": " + positions);
                }

                processed.add(value);
            }
        }
    }

    // Tính tổng các số nguyên nhỏ hơn 50
    public void sumLessThanFifty(ArrayList<Integer> arrayList) {
        int sum = 0;

        System.out.print("Tổng các số nguyên nhỏ hơn 50 là: ");
        for (int num : arrayList) {
            if (num < 50) {
                sum += num;
            }
        }

        System.out.print(sum);
        System.out.println();
    }

    // Sắp xếp các số nguyên theo giá trị tăng dần
    public void sortASC(ArrayList<Integer> arrayList) {
        System.out.print("Sắp xếp các số nguyên theo giá trị tăng dần: ");

        Collections.sort(arrayList);

        System.out.println(arrayList);
    }

    // Số nguyên hoàn hảo
    public void findPerfectNumber(ArrayList<Integer> arrayList) {
        int maxDivisors = 0;
        ArrayList<Integer> perfectNumbers = new ArrayList<>();

        for (int num : arrayList) {
            int divisorCount = 0;

            for (int divisor : arrayList) {
                if (divisor != 0 && num % divisor == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                perfectNumbers.clear();
                perfectNumbers.add(num);
            } else if (divisorCount == maxDivisors) {
                perfectNumbers.add(num);
            }
        }

        System.out.println("Các số hoàn hảo: " + perfectNumbers);
    }
}
