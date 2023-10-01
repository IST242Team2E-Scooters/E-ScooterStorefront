public class Item {

    private int productId;
    private String name;

    private ProductCategory category;

    private double price;
    private String description;

    /** Creates Item constructor for e-scooters to be created
     *
     * @param productId
     * @param name
     * @param price
     * @param category
     * @param description
     */
    public Item(int productId, String name, double price, ProductCategory category, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    /** Creates getter for the product ID of each e-scooter
     *
     * @return
     */
    public int getProductId() {
        return productId;
    }

    /** Creates getter for the product name of each e-scooter
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /** Creates getter for the product category of each e-scooter
     *
     * @return
     */
    public ProductCategory getCategory() {
        return category;
    }

    /** Creates getter for the price of each e-scooter
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /** Creates getter for the description of each e-scooter
     *
     * @return
     */
    public String getDescription() {
        return description;
    }
}
