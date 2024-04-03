import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class ComparebleExample implements Comparable<ComparebleExample>{
    int age;
    String name;
    int roll;
    ComparebleExample(int age,String name,int roll){
        this.age=age;
        this.name=name;
        this.roll=roll;
     
    }
    @Override
    public int compareTo(ComparebleExample o) {
        // TODO Auto-generated method stub
        return o.roll-o.roll;
    }

    public String toString(){
        return  age+" "+name+" "+roll;
    }

}


// class SortByName implements Comparator<Customer>{
//     public int compare(Customer o1 , Customer o2){
//         return o1.getName().compareTo(o2.getName());
//     }
// }


class SortByName implements Comparator<ComparebleExample>{
    @Override
    public String compare(ComparebleExample o1, ComparebleExample o2) {
        // TODO Auto-generated method stub
        return  o1.name- o1.name;
    }
}
/**
 * compareble
 */
public class compareble{
    public static void main(String[] args) {
        TreeSet<ComparebleExample> o =new TreeSet<>();
        o.add(new ComparebleExample(46,"A",24));
        o.add(new ComparebleExample(4, "B", 20));
        o.add(new ComparebleExample(3, "c", 20));

        for(ComparebleExample  element: o){
        System.out.println(element);
        }
    
       SortedSet<SortByName> name= new  SortedSet<SortByName>();
       neme.put()

    
    }


    
}
