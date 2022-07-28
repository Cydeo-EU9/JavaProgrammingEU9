package avengers_28_07_2022;

import java.util.Arrays;

public class Replit_Method_LameDB {
    //A database (DB) is an organized collection of data. In other words, a database is used by an organization as a method of storing, managing and retrieving information.
//  SQL - Oracle
//        Implement the **lameDb()** method
//
//        - This method has 4 String parameters and returns a String
//        - `db`: information in database. Each item is separated by a **#**. Each element will also have a number in the beginning about which element it is.
//        - `op`: action that will be taken on database (add, edit, or remove)
//        - `id`: The id number that will be manipulated
//        - `data`: extra data that will be used alongside operation
//
//        - The method returns the modifed database
//
//        Examples:
//
//        ```
//        m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
//
//        returns:  1etsy#2wooden#3spoon#4aaa
//        ```
//
//        ```
//        m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")
//
//        returns:  1bbb#2etsy#3wooden#4spoon
//        ```
//
//        ```
//        m.lameDb("1test#2bla#3foo","edit","2","bbb")
//
//        returns:  1test#2bbb#3foo
//        ```
//
//        ```
//        m.lameDb("1tst#2bla#3foo","delete","1","")
//
//        returns:  #2bla#3foo
//        ```
//
//        Hint: use arrays
    /*
    Arrays,
    String Manipulation
    Method with return type
    Loops
     */



    /*
    AccessModifiers Specifier ReturnType MethodName(Parameters ){
            Statement
    }
    private: can be reached only from inside Class itself
    default:
     */

    public static String lameDb(String db, String op, String id, String data){
        String resultDb="";
       String[] arr = db.split("#"); // turning your String into an Array
        System.out.println(Arrays.toString(arr)); // printing an array
       // for(String each: arr){ }
        for (int i = 0; i < arr.length; i++) {  // I need to get rid of numbers at the elements
            arr[i] = arr[i].substring(1);
        }
        System.out.println(Arrays.toString(arr));
        int index = Integer.parseInt(id)-1;  // 4th element means index 3 for Array
        String[] newArr = null;

        switch (op){
            case "add":
                // our original array will increase with 1 element
                newArr = new String[arr.length+1];
                for(int i=0,j=0; i < arr.length+1; ){
                    if(index==i){
                        newArr[i]= data;
                        i++;
                        continue;
                    }
                    newArr[i]=arr[j];
                    i++;
                    j++;
                }
                break;
            case "edit":
                // our original array will stay same
                newArr = new String[arr.length];
                for(int i=0; i< arr.length;i++){
                    if(index==i){
                        newArr[i]= data;
                        continue;
                    }
                    newArr[i]=arr[i];
              }
                break;
            case "delete":
                // our original array will decrease with 1 element
                newArr = new String[arr.length];
                for (int i=0;i< arr.length;i++){
                    if(index==i){
                        newArr[i]=data;
                        continue;
                    }
                    newArr[i]=arr[i];
                }

                break;
        }

        System.out.println(Arrays.toString(newArr));
        int z = 1;
        for(String each: newArr){  // to create result String with each of our Array element
            if(!each.isEmpty()) {
                resultDb += z + each + "#";
                z++;
            }else {
                resultDb+="#";
                z++;
                continue;
            }
        }
        return resultDb.substring(0,resultDb.length()-1);  // taking out the last # from the end
    }

    public String lameDb(String db, String op, int id, String data){  // this is an instance method even though it is in the same class, it needs an object created to be called
        String resultDb="oscar";
        // some solution
        return resultDb;
    }

    public static void main(String[] args) {
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","1","bbb"));
     //   System.out.println(Replit_Method_LameDB.lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa")); Since this a static method we can call with class name as well


        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));


        System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));


        Replit_Method_LameDB obj = new Replit_Method_LameDB();
        obj.lameDb("1etsy#2wooden#3spoon", "add", 4, "aaa");

    }



}
