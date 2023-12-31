import java.util.Scanner;

/**
 *
 */
public class Inventory {

    /**
     * // Three-dimensional array to store items
     * // Initialize a 6x6x6 array to store items
     */
    private Item[][][] items;
    public Inventory() {
        items = new Item[6][6][6];
        // Initialize items here, creating 36 items and placing them in the 6x6x6 array.

        /**
         *  // Layer 0 - Performance category items
         *  // Add more items in Layer 0 here...
         */


        // Layer 0
        items[0][0][0] = new Item(1, "APOLLO PRO", 199.99, ProductCategory.PERFORMANCE, "\n Tires: Michelin SPORT\n Suspension: Electronic\n Available colors: Grey\n Max Speed: 100 MPH\n Charge time:\n Weight limit:150\n Description:The APOLLO PRO is designed for high-performance enthusiasts. With Michelin SPORT tires and electronic suspension, it offers a thrilling ride. This scooter is available in a sleek grey color, and it boasts a maximum speed of 100 MPH. Charge up and experience the power!\n ");
        items[0][0][1] = new Item(2, "ZERO 10X", 299.99, ProductCategory.PERFORMANCE, "\n Tires: Bridgestone SPORT\n Suspension: Dual Shock\n Available colors: Black\n Max Speed: 100 MPH \n Range\n Weight limit:250\n Description:The ZERO 10X is a top-tier performer with Bridgestone SPORT tires and dual shock suspension. It's available in a stylish black finish and can reach speeds of up to 100 MPH. Plus, it provides impressive range and has a weight limit of 250 pounds. Get ready for an exhilarating ride!  ");
        items[0][0][2] = new Item(3, "THE JOE OAKES", 1000.00, ProductCategory.PERFORMANCE, "\n Tires: Continental SPORT\n Suspension: Air\n Available colors: Pink\n Max Speed: 250 MPH\n Weight limit:350\n Description:Meet THE JOE OAKES, a performance electric scooter featuring Continental SPORT tires and air suspension. It stands out with its vibrant pink color and offers a remarkable top speed of 250 MPH. With a weight limit of 350 pounds, it's both powerful and accommodating. Get noticed on this exceptional scooter! ");
        items[0][1][0] = new Item(4, "DUAL PED SCORPION", 499.99, ProductCategory.PERFORMANCE, "\n Tires: Pirelli SPORT\n Suspension: Inverted Front Forks\n Available colors: Yellow\n Max Speed: 300 MPH\n Weight limit:450\n Description:The DUAL PED SCORPION is a high-performance marvel equipped with Pirelli SPORT tires and inverted front forks for superior handling. Its striking yellow color will turn heads, and it can achieve an astonishing top speed of 300 MPH. With a weight limit of 450 pounds, it's built for thrill-seekers. ");
        items[0][1][1] = new Item(5, "APOLLO", 599.99, ProductCategory.PERFORMANCE, "\n Tires: Dunlop SPORT\n Suspension: Gas Charged Rear Shocks\n Available colors: Green\n Max Speed: 350 MPH\n Weight limit:600\n Description:The APOLLO electric scooter is a performance beast featuring Dunlop SPORT tires and gas-charged rear shocks. Its vibrant green color adds a touch of style to your rides, and it can reach an impressive maximum speed of 350 MPH. With a weight limit of 600 pounds, it's a powerhouse of performance. ");
        items[0][1][2] = new Item(6, "WOLF WARRIOR 11", 699.99, ProductCategory.PERFORMANCE, "\n Tires: Kenda SPORT\n Suspension: Threadless Fork and Compression System\n Available colors: Purple\n Max Speed: 400 MPH\n Weight limit:650\n Description:The WOLF WARRIOR 11 is an ultimate performance scooter sporting Kenda SPORT tires and a threadless fork with a compression system. Its regal purple color is sure to make a statement, and it can conquer speeds of up to 400 MPH. With a weight limit of 650 pounds, it's the embodiment of power and endurance. Unleash the beast within!");

        /**
         * // Layer 1 - Offroad category items
         * // Add more items in Layer 1 here...
         */

// Layer 1
        items[1][0][0] = new Item(7, "E MOVE CRUISER", 350.99, ProductCategory.OFFROAD, "\n Tires: Michelin OFF\n Suspension: Magnetic\n Available colors: Teal\n Max Speed: 30 MPH\n Weight limit: 190\n Description:The E MOVE CRUISER is your perfect companion for off-road adventures. Equipped with Michelin OFF-road tires and magnetic suspension, it's built for rugged terrain. This scooter comes in a stylish teal color, has a maximum speed of 30 MPH, and a weight limit of 190 pounds. Take it on a journey into the wild! ");
        items[1][0][1] = new Item(8, "APOLLO PHANTOM", 360.99, ProductCategory.OFFROAD, "\n Tires: Bridgestone OFF\n Suspension: Telescopic Front Forks \n Available colors: Deep Blue\n Max Speed: 40 MPH\n Charge time:1Hr\n Weight limit: 200\n Description:The APOLLO PHANTOM is designed to conquer off-road challenges with Bridgestone OFF-road tires and telescopic front forks. It features a deep blue color and can reach speeds of up to 40 MPH. With a charge time of just 1 hour and a weight limit of 200 pounds, it's ready for action whenever you are. ");
        items[1][0][2] = new Item(9, "WOLF KING PRO", 370.99, ProductCategory.OFFROAD, "\n Tires: Continental OFF\n Suspension: Spring \n Available colors: Abyss Black\n Max Speed: 60 MPH\n Charge time:49min\n Weight limit: 300\n Description:The WOLF KING PRO is a force to be reckoned with, featuring Continental OFF-road tires and a spring suspension system. Its abyss black color exudes confidence, and it can achieve an impressive top speed of 60 MPH. With a quick charge time of 49 minutes and a weight limit of 300 pounds, it's built for off-road enthusiasts. ");
        items[1][1][0] = new Item(10, "E CITY", 380.99, ProductCategory.OFFROAD, "\n Tires: Pirelli OFF\n Suspension: Monoshock\n Available colors: Matte Black\n Max Speed: 70 MPH\n Charge time:75min\n Weight limit: 350\n Description:The E CITY electric scooter is designed for off-road adventures with Pirelli OFF-road tires and a monoshock suspension. Its matte black finish adds a touch of sophistication, and it can reach speeds of up to 70 MPH. With a charge time of 75 minutes and a weight limit of 350 pounds, it's your ticket to thrilling off-road experiences. ");
        items[1][1][1] = new Item(11, "Q1 HUMMER", 390.99, ProductCategory.OFFROAD, "\n Tires: Dunlop OFF\n Suspension: Hydraulic Friction Dampers \n Available colors: Magenta\n Max Speed: 90 MPH\n Charge time:30min\n Weight limit: 450\n Description:The Q1 HUMMER is a beast on off-road terrain, equipped with Dunlop OFF-road tires and hydraulic friction dampers. Its vibrant magenta color sets it apart, and it can achieve an impressive top speed of 90 MPH. With a quick charge time of just 30 minutes and a weight limit of 450 pounds, it's a true off-road powerhouse. ");
        items[1][1][2] = new Item(12, "EGO G BOOSTER", 400.99, ProductCategory.OFFROAD, "\n Tires: Kenda OFF\n Suspension: Heavy-Duty Coil Springs\n Available colors: Silver\n Max Speed: 100 MPH\n Charge time:40min\n Weight limit: 500\n Description:The EGO G BOOSTER is designed to take off-road adventures to the next level with Kenda OFF-road tires and heavy-duty coil springs. Its sleek silver color exudes style, and it can reach an astonishing top speed of 100 MPH. With a charge time of 40 minutes and a weight limit of 500 pounds, it's the ultimate off-road companion for thrill-seekers. Get ready to boost your ego on this incredible scooter! ");

        /**
         * // Layer 2 - Urban category items
         * // Add more items in Layer 2 here...
         */

// Layer 2
        items[2][0][1] = new Item(14, "URBAN CRUISER PRO", 560.99, ProductCategory.URBAN, "\n Tires: Bridgestone URB\n Suspension: Gas-Charged Rear Shocks\n Available colors: Platinum\n Max Speed: 150 MPH\n Charge time:50min\n Weight limit: 350\n Description:The URBAN CRUISER PRO is the pinnacle of urban mobility. It's equipped with Bridgestone URBAN tires and features gas-charged rear shocks for a smooth and exhilarating ride. Available in a luxurious platinum color, it can reach an impressive top speed of 150 MPH. With a quick charge time of 50 minutes and a weight limit of 350 pounds, it's designed for urban professionals who demand the best in style and performance.  ");
        items[2][0][2] = new Item(15, "URBAN CRUISER", 670.99, ProductCategory.URBAN, "\n Tires: Continental URB\n Suspension: Polyurethane\n Available colors: Inferno Red\n Max Speed: 160 MPH\n Charge time:45min\n Weight limit: 365\n Description:The URBAN CRUISER is a stylish and speedy choice for urban commuters. With Continental URBAN tires and a polyurethane suspension, it ensures a comfortable and responsive ride. This scooter is available in a striking inferno red color and can reach a thrilling top speed of 160 MPH. With a quick charge time of 45 minutes and a weight limit of 365 pounds, it's the perfect companion for those who love to make a statement in the city. ");
        items[2][1][0] = new Item(16, "DOWNTOWN EXPRESS", 780.99, ProductCategory.URBAN, "\n Tires: Pirelli URB\n Suspension: Progressive Springs\n Available colors: Light Blue\n Max Speed: 170 MPH\n Charge time:40min\n Weight limit: 400\n Description:The DOWNTOWN EXPRESS is designed to conquer urban streets with ease. Featuring Pirelli URBAN tires and progressive springs, it offers a smooth and reliable ride. Its elegant light blue color adds a touch of sophistication, and it can reach a maximum speed of 170 MPH. With a quick charge time of 40 minutes and a weight limit of 400 pounds, it's the ideal choice for city commuters who value both style and efficiency. ");
        items[2][1][1] = new Item(17, "URBAN GLIDE 2", 890.99, ProductCategory.URBAN, "\n Tires: Dunlop URB\n Suspension: Hardtail\n Available colors: Off White\n Max Speed: 180 MPH\n Charge time:35min\n Weight limit: 500\n Description:The URBAN GLIDE 2 is the epitome of urban elegance and speed. Equipped with Dunlop URBAN tires and a hardtail suspension, it ensures a responsive and agile ride. Available in a clean off-white color, it can achieve an impressive top speed of 180 MPH. With a quick charge time of 35 minutes and a weight limit of 500 pounds, it's the perfect urban companion for those who appreciate a blend of style and performance. ");
        items[2][1][2] = new Item(18, "METRO JET", 900.99, ProductCategory.URBAN, "\n Tires: Kenda URB\n Suspension: Remote Reservoir\n Available colors: Egg Shell\n Max Speed: 190 MPH\n Charge time:30min\n Weight limit: 600\n Description:The METRO JET is the ultimate choice for urban jet-setters. Featuring Kenda URBAN tires and a remote reservoir suspension system, it offers a luxurious and smooth ride. Its elegant eggshell color exudes sophistication, and it can reach an astonishing top speed of 190 MPH. With a quick charge time of 30 minutes and a weight limit of 600 pounds, it's designed for those who demand the very best in urban mobility. Elevate your city commute with the METRO JET! ");

        /**
         * // Layer 3 - Luxury category items
         * // Add more items in Layer 3 here...
         */

// Layer 3
        items[3][0][0] = new Item(19, "MIDNIGHT CRUISER", 10000.99, ProductCategory.LUXURY, "\n Tires: Michelin LUX\n Suspension: Heavy-Duty Sidecar Suspension\n Available colors: Midnight Green\n Max Speed: 125 mph\n Charge time:20min\n Weight limit: 150\n Description:The MIDNIGHT CRUISER offers a luxurious journey with Michelin LUX tires and heavy-duty sidecar suspension. Its midnight green color, along with a top speed of 125 mph, promises a stylish and elegant ride. ");
        items[3][0][1] = new Item(20, "PEARL ELEGANCE", 11000.99, ProductCategory.LUXURY, "\n Tires: Bridgestone LUX\n Suspension: Anti-Dive Suspension\n Available colors: Pearl White\n Max Speed: 130 mph\n Charge time:25min\n Weight limit: 160\n Description: PEARL ELEGANCE embodies sophistication with Bridgestone LUX tires and anti-dive suspension. Its pearl white finish exudes refinement, and a maximum speed of 130 mph adds to its luxurious appeal.");
        items[3][0][2] = new Item(21, "MAJESTIC VOYAGER", 12000.99, ProductCategory.LUXURY, "\n Tires: Continental LUX\n Suspension: Dual-Stage\n Available colors: Majestic Gold\n Max Speed: 150 mph\n Charge time:33min\n Weight limit: 170\n Description:The MAJESTIC VOYAGER is a symbol of opulence with Continental LUX tires and dual-stage suspension. Its majestic gold color makes a statement, and a top speed of 150 mph ensures a regal and comfortable journey. ");
        items[3][1][0] = new Item(22, "BLOOD EXPLORER", 150000.99, ProductCategory.LUXURY, "\n Tires: Pirelli LUX\n Suspension: Adjustable Adventure\n Available colors: Blood Red\n Max Speed: 160 mph\n Charge time:38min\n Weight limit: 180\n Description:The BLOOD EXPLORER is built for adventure with Pirelli LUX tires and adjustable adventure suspension. Its striking blood red hue signifies excitement, and a maximum speed of 160 mph promises thrilling exploration. ");
        items[3][1][1] = new Item(23, "SKY DREAMER", 200000.99, ProductCategory.LUXURY, "\n Tires: Dunlop LUX\n Suspension: Fork Cartridges\n Available colors: Sky Blue\n Max Speed: 170 mph\n Charge time:40min\n Weight limit: 200\n Description:The SKY DREAMER offers a dreamy ride with Dunlop LUX tires and fork cartridges suspension. Its serene sky blue color evokes a sense of tranquility, and a top speed of 170 mph creates a luxurious and uplifting experience. ");
        items[3][1][2] = new Item(24, "CRYSTAL PRESTIGE", 500500.99, ProductCategory.LUXURY, "\n Tires: Kenda LUX\n Suspension: Trike-Specific\n Available colors: Crystal White\n Max Speed: 180 mph\n Charge time:45min\n Weight limit: 400\n Description:The CRYSTAL PRESTIGE stands for ultimate luxury and prestige with Kenda LUX tires and trike-specific suspension. Its pristine crystal white color symbolizes purity, and a maximum speed of 180 mph signifies the pinnacle of opulence and performance. ");

        /**
         * //Layer 4 - Cargo category items
         * // Add more items in Layer 4 here...
         */

// Layer 4
        items[4][0][0] = new Item(25, "AURORA ELITE", 3350.99, ProductCategory.CARGO, "\n Tires: Michelin CAR\n Suspension: Progressive Damping \n Available colors: Cyan\n Max Speed: 50 mph\n Charge time:45min\n Weight limit:300\n Description:The AURORA ELITE is the pinnacle of cargo scooters with Michelin CAR tires and progressive damping suspension. It's available in a striking cyan color and is designed for efficient cargo transportation. With a maximum speed of 50 mph, a quick charge time of 45 minutes, and a weight limit of 300 pounds, it's perfect for delivering your cargo with style and ease. ");
        items[4][0][1] = new Item(26, "CARGO VOYAGER", 3650.99, ProductCategory.CARGO, "\n Tires: Bridgestone CAR\n Suspension: Upside-Down (USD) Forks\n Available colors: Navy Blue\n Max Speed: 90 mph\n Charge time:30min\n Weight limit: 400\n Description:The CARGO VOYAGER is built for cargo adventures with Bridgestone CAR tires and upside-down (USD) forks suspension. Its navy blue finish adds a touch of elegance to your cargo deliveries, and it can reach speeds of up to 90 mph. With a quick charge time of 30 minutes and a weight limit of 400 pounds, it's the ultimate choice for efficient cargo transport.");
        items[4][0][2] = new Item(27, "REGAL SERIES", 3750.99, ProductCategory.CARGO, "\n Tires: Continental CAR\n Suspension: Remote Reservoir Suspensions\n Available colors: Deep Yellow\n Max Speed: 100 mph\n Charge time:36min\n Weight limit: 500\n Description:The \"REGAL SERIES\" is a cargo scooter that combines luxury with functionality, featuring Continental CAR tires and remote reservoir suspensions. Its deep yellow color exudes confidence, and it can achieve a maximum speed of 100 mph. With a quick charge time of 36 minutes and a weight limit of 500 pounds, it's designed for cargo transport in style.");
        items[4][1][0] = new Item(28, "ELYSIAN PRO", 3850.99, ProductCategory.CARGO, "\n Tires: Pirelli CAR\n Suspension: Electronically Adjustable\n Available colors: Orange\n Max Speed: 109 mph\n Charge time:20min\n Weight limit:600\n Description: The \"ELYSIAN PRO\" is the professional's choice for cargo transportation with Pirelli CAR tires and electronically adjustable suspension. Its vibrant orange color signifies efficiency, and it can reach speeds of up to 109 mph. With a quick charge time of 20 minutes and a weight limit of 600 pounds, it's the go-to scooter for cargo professionals.");
        items[4][1][1] = new Item(29, "ELYSIAN MAX", 3950.99, ProductCategory.CARGO, "\n Tires: Dunlop CAR\n Suspension: Dual Rear\n Available colors: Red\n Max Speed: 170 mph\n Charge time:25min\n Weight limit:700 \"ELYSIAN MAX\" is all about maximum cargo delivery efficiency with Dunlop CAR tires and dual rear suspension. Its bold red color denotes power, and it can achieve a thrilling top speed of 170 mph. With a quick charge time of 25 minutes and a weight limit of 700 pounds, it's the ultimate choice for handling large cargo loads.");
        items[4][1][2] = new Item(30, "ELYSIAN GOLD", 4050.99, ProductCategory.CARGO, "\n Tires: Kenda CAR\n Suspension: Pneumatic Suspension\n Available colors: Blood Orange\n Max Speed: 180 mph\n Charge time:15min\n Weight limit:800\n Description: The \"ELYSIAN GOLD\" is the gold standard in cargo scooters with Kenda CAR tires and pneumatic suspension. Its blood orange color represents strength, and it can reach an impressive top speed of 180 mph. With a quick charge time of just 15 minutes and a weight limit of 800 pounds, it's the epitome of speed and efficiency for cargo transport.");

        /**
         * //Layer 5 - Long Range category items
         * // Add more items in Layer 5 here...
         */

// Layer 5
        items[5][0][0] = new Item(31, "ENDURANCE VOYAGER", 5050.99, ProductCategory.LONGRANGE, "\n Tires: Michelin LR\n Suspension: Lever-Link\n Available colors: Light Green\n Max Speed: 200 mph\n Charge time:30min\n Weight limit: 300\n Description:The \"ENDURANCE VOYAGER\" is built for long journeys with Michelin LR tires and Lever-Link suspension. Its light green color and 200 mph top speed make it a reliable choice for extended rides.");
        items[5][0][1] = new Item(32, "THE ODYSSEY", 6080.99, ProductCategory.LONGRANGE, "\n Tires: Bridgestone LR\n Suspension: Semi-Active\n Available colors: Light Grey\n Max Speed: 250 mph\n Charge time:33min\n Weight limit: 200\n Description:\"THE ODYSSEY\" is designed for epic adventures with Bridgestone LR tires and semi-active suspension. In a light grey finish and a top speed of 250 mph, it promises a thrilling and enduring journey.");
        items[5][0][2] = new Item(33, "MARATHON EXPLORER PRO", 7050.99, ProductCategory.LONGRANGE, "\n Tires: Continental LR\n Suspension: Carbon Fiber Coil\n Available colors: Light Yellow\n Max Speed: 260 mph\n Charge time:36min\n Weight limit: 196\n Description:The \"MARATHON EXPLORER PRO\" offers long-range exploration with Continental LR tires and carbon fiber coil suspension. Its light yellow color and 260 mph top speed ensure efficient and adventurous travels.");
        items[5][1][0] = new Item(34, "MARATHON EXPLORER", 8750.99, ProductCategory.LONGRANGE, "\n Tires: Pirelli LR\n Suspension: Progressive Linkage\n Available colors: Matte Yellow\n Max Speed: 270 mph\n Charge time:38min\n Weight limit: 155\n Description:MARATHON EXPLORER\" is a long-range champion with Pirelli LR tires and progressive linkage suspension. In matte yellow and a top speed of 270 mph, it's perfect for extended excursions.");
        items[5][1][1] = new Item(35, "RANGE MASTER", 9759.99, ProductCategory.LONGRANGE, "\n Tires: Dunlop LR\n Suspension: Rebound Adjustable\n Available colors: Matte White\n Max Speed: 280 mph\n Charge time:40min\n Weight limit:145\n Description: The \"RANGE MASTER\" is designed for ultimate long-range performance with Dunlop LR tires and rebound adjustable suspension. In matte white and a top speed of 280 mph, it's an efficient choice for covering vast distances.");
        items[5][1][2] = new Item(36, "ECO CRUISE INFINITE", 10000.99, ProductCategory.LONGRANGE, "\n Tires: Kenda LR\n Suspension: Hybrid\n Available colors: Matte Grey\n Max Speed: 290 mph\n Charge time:45min\n Weight limit:135\n Description:The \"ECO CRUISE INFINITE\" redefines long-range riding with Kenda LR tires and hybrid suspension. In matte grey and a top speed of 290 mph, it's the epitome of efficient and sustainable travel. ");



    }

    /** The getter to return items from the Item array
     *
     * @return
     */
    public Item[][][] getItems() {
        return items;
    }

    /**
     * // Getter method to retrieve the entire item array
     * // Method to get an item by its unique product ID
     * // Item not found
     * @param productId
     * @return
     */
    public Item getItemById(int productId) {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                for (int z = 0; z < 6; z++) {
                    if (items[x][y][z] != null && items[x][y][z].getProductId() == productId) {
                        return items[x][y][z];
                    }
                }
            }
        }
        return null; // Item not found
    }


}
