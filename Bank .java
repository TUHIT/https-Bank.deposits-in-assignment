class bankAccount

    {

        public String name;

        public long id;

        public int type, bal;

        public bankAccount()

        {

            name = "";

            id = 0;

            type = 0;

            bal = 0;

        }

        public void assignValues()throws IOException

        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter name");

            name = br.readLine();

            System.ou.println("Enter acount number");

            id = Integer.parseInt(br.readLine());

            System.out.println("Enter 1 for Recurring Deposit type account");

            System.out.println("Enter 2 for Fixed Deposit type account");

            type = Integer.parseInt(br.readLine());

            System.out.println("Enter initial balance");

            bal = Integer.parseInt(br.readLine());

        }

        public int depositMoney()throws IOException

        {

            System.out.println("Enter amount you wanna deposit");

            int dep = Integer.parseInt(br.readLine());

            bal += dep;

            return bal;

        }

        public int withdrawMoney()throws IOException

        {

            System.out.println("Enter amount you wanna withdraw");

            int wd = Integer.parseInt(br.readLine());

            if(wd < bal)System.out.println("Sorry, you don't have that much amount in your account");

            else bal -= wd;

            return bal;

        }

        public void displayInfo()

        {

            System.out.println("Name: " + name);

            System.out.println("Balance: " + bal);

        }

        public static void main()throws IOException

        {

            bankAccount();

            assignValues();

            System.out.println("Enter 1 for depositing an amount");

            System.out.println("Enter 2 for withdrawing an amount");

            System.out.println("Enter 3 to display name and balance");

            BufferedReader br = new BufferedRead(new InputStreamReader(System.in));

            int c = Integer.parseInt(br.readLine());

            switch(c)

            {

                case 1: bal = depositMoney();

                break;

                case 2: bal = withdrawMoney();

                break;

                case 3: displayInfo();

                break;

                default: System.out.println("Invalid choice");

            }

            if(c==1 || c==2) System.out.println("Balance: " + bal);

        }

    }
