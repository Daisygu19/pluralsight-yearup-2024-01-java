package com.pluralsight;

import com.pluralsight.views.UserInput;

    public class DealershipApplication {

        UserInput ui = new UserInput();

        public void run()
        {
            ui.displayHomeScreen();

            while(true)
            {
                String name = ui.getDealersName();
                if (name.equalsIgnoreCase("exit"))
                {
                    break;
                }

                startBuy(name);
            }
        }

        public void startBuy(String name)
        {
            Buy buy;

            String type = ui.displayVehicleType();
        }


    }

