package avengers_18_08_2022;


import java.util.ArrayList;

public class TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */

    private ArrayList<Item> items;  // this an Arraylist Object, that holds objects of Item Type
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        this.items = new ArrayList<Item>();    // creates an empty arraylist object
        this.onSaleItems = new ArrayList<OnSaleItem>();
    }

    /**
     * adds an item object to regularItems list
     * @param nameOfItem
     */

    public void addItem(Item nameOfItem){
        items.add(nameOfItem);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item){
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */

    public ArrayList<Item> getItems(){return this.items;}

    /**
     * getter for onSaleItems
     * @return
     */

    public ArrayList<OnSaleItem> getOnSaleItems(){return this.onSaleItems;}

    /**
     * return count of regularItem object
     * @return
     */

    public int countOfItems(){return items.size();}


    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int countOfOnSaleItems(){return onSaleItems.size();}

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */

    public ArrayList<String> getAllItemsNamesINSTORE(){
        ArrayList<String> allNames = new ArrayList<>();
        for(Item each: items){
            allNames.add(each.getName());
        }
        for(OnSaleItem each: onSaleItems){
            allNames.add(each.getName());
        }
        return allNames;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */

    public double getPriceOfItem (int catalogNumber){
        for(Item each: items){
            if(each.getCatalogNumber()==catalogNumber){
                    return each.getPrice();
            }
        }
        for(OnSaleItem each: onSaleItems){
            if(each.getCatalogNumber()==catalogNumber){
                return each.getPrice();
            }
        }
        return 0.0;
      }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */



    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */



    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */

}
