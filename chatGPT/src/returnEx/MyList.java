package returnEx;

import java.util.ArrayList;

public class MyList {
    private ArrayList<Integer> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(int num) {
        list.add(num);
    }

    public int get(int index) {
        return list.get(index);
    }


public static void main(String[] args) {
	MyList myList = new MyList();
	myList.add(1);
	myList.add(2);
	myList.add(3);
	int secondElement = myList.get(1); // secondElement 변수에 2가 저장됩니다.
	
	System.out.println(secondElement);
}


}

