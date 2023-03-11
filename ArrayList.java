import java.util.*;
class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add
        list.add(1);
        list.add(2);
        System.out.println(list);
        //get

        int a= list.get(0);
        System.out.println(a);

        //add in between
        list.add(1,5);
        System.out.println(list);

        //change
        list.set(0,9);
        System.out.println(list);

        //delete
        list.remove(2);
        System.out.println(list);

        //size 
        int a1=list.size();
        System.out.println(a1);

        //loops
        for(int i=0;i<a1;i++)
        {
            System.out.println(list.get(i));
        }

        // sort
        Collections.sort(list);
        System.out.println(list);

    }
}