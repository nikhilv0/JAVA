package com.xworkz.RefAndvar;

public class Security {
        String Username;
        String Password;
        String Firewalls;
        String IPAddress;

        Security(String Username,String Password,String Firewalls,String IPAddress){
            this.Username=Username;
            this.Password=Password;
            this.Firewalls=Firewalls;
            this.IPAddress=IPAddress;
        }

        void securityMethod(){
            System.out.println("Security:");
            System.out.println("Username:"+this.Username);
            System.out.println("Password:"+this.Password);
            System.out.println("Firewalls:"+this.Firewalls);
            System.out.println("IPAddress:"+this.IPAddress);

            Personal personal1=new Personal("John Doe",30,"123 Main St, NY","9876543210");
            Personal personal2=new Personal("Arjun Mehta",28,"555 Greenway, Mumbai","5432109876");
            Personal personal3=new Personal("Emily Brown",35,"101 Lake View, TX","6543210987");
            Personal personal4=new Personal("Raj Kumar",40,"789 MG Road, DelhiY","7654321098");
            Personal personal5=new Personal("Alice Smith",25,"456 Park Ave, CA","8765432109");
            Personal[] personals={personal1,personal2,personal3,personal4,personal5};
            for (Personal personal:personals){
                personal.personalMethod();

            }
        }
}
