package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.extra.*;
import com.xworkz.inheritance.external.*;
import com.xworkz.inheritance.internal.*;
import com.xworkz.inheritance.additonal.*;



public class MainRunner {
    public static void main(String[] args) {


        System.out.println("Invoking Parent class");
        Resource resource=new Resource();
            resource.getInfo();
            resource.load();
            resource.release();
            resource.save();
            resource.refresh();
        System.out.println("File _________________________________");

            Resource resource1=new File();
            resource1.refresh();
            resource1.save();
            resource1.release();
            resource1.load();
            resource1.getInfo();

            File file=new File();
            file.load();
            file.save();
            file.refresh();
            file.release();
            file.getInfo();


        System.out.println("Database _________________________________");
            Resource resource2=new DataBase();
            resource2.refresh();
            resource2.save();
            resource2.release();
            resource2.load();
            resource2.getInfo();

            DataBase dataBase=new DataBase();
            dataBase.load();
            dataBase.save();
            dataBase.refresh();
            dataBase.release();
            dataBase.getInfo();

            System.out.println("Memory _________________________________");
            Resource resource4=new Memory();
            resource4.refresh();
            resource4.save();
            resource4.release();
            resource4.load();
            resource4.getInfo();

            Memory memory=new Memory();
            memory.load();
            memory.save();
            memory.refresh();
            memory.release();
            memory.getInfo();

        System.out.println("Stream _________________________________");
            Resource resource5=new Stream();
            resource5.refresh();
            resource5.save();
            resource5.release();
            resource5.load();
            resource5.getInfo();

            Stream stream=new Stream();
            memory.load();
            memory.save();
            memory.refresh();
            memory.release();
            memory.getInfo();

        System.out.println("Image _________________________________");
            Resource resource6=new Image();
            resource6.refresh();
            resource6.save();
            resource6.release();
            resource6.load();
            resource6.getInfo();

            Image image=new Image();
            image.load();
            image.save();
            image.refresh();
            image.release();
            image.getInfo();

        System.out.println("Video _________________________________");
            Resource resource7=new Video();
            resource7.refresh();
            resource7.save();
            resource7.release();
            resource7.load();
            resource7.getInfo();

            Video video=new Video();
            video.load();
            video.save();
            video.refresh();
            video.release();
            video.getInfo();

        System.out.println("Audio _________________________________");
            Resource resource8=new Audio();
            resource8.refresh();
            resource8.save();
            resource8.release();
            resource8.load();
            resource8.getInfo();

            Audio audio=new Audio();
            audio.load();
            audio.save();
            audio.refresh();
            audio.release();
            audio.getInfo();

        System.out.println("Document _________________________________");
            Resource resource9=new Document();
            resource9.refresh();
            resource9.save();
            resource9.release();
            resource9.load();
            resource9.getInfo();

            Document document=new Document();
            document.load();
            document.save();
            document.refresh();
            document.release();
            document.getInfo();

        System.out.println("Cache _________________________________");
            Resource resource10=new Cache();
            resource10.refresh();
            resource10.save();
            resource10.release();
            resource10.load();
            resource10.getInfo();

            Cache cache=new Cache();
            cache.load();
            cache.save();
            cache.refresh();
            cache.release();
            cache.getInfo();

        System.out.println("Configuration _________________________________");
        Resource resource11=new Configuration();
        resource6.refresh();
        resource6.save();
        resource6.release();
        resource6.load();
        resource6.getInfo();

        Configuration configuration=new Configuration();
        configuration.load();
        configuration.save();
        configuration.refresh();
        configuration.release();
        configuration.getInfo();

        System.out.println("Service _________________________________");
        Resource resource12=new Service();
        resource12.refresh();
        resource12.save();
        resource12.release();
        resource12.load();
        resource12.getInfo();

        Service service=new Service();
        service.load();
        service.save();
        service.refresh();
        service.release();
        service.getInfo();

        System.out.println("User _________________________________");
            Resource resource13=new User();
            resource13.refresh();
            resource13.save();
            resource13.release();
            resource13.load();
            resource13.getInfo();

            User user=new User();
            user.load();
            user.save();
            user.refresh();
            user.release();
            user.getInfo();

        System.out.println("Session _________________________________");
        Resource resource14=new Session();
            resource14.refresh();
            resource14.save();
            resource14.release();
            resource14.load();
            resource14.getInfo();

            Session session=new Session();
            session.load();
            session.save();
            session.refresh();
            session.release();
            session.getInfo();

        System.out.println("Asset _________________________________");
            Resource resource15=new Asset();
            resource15.refresh();
            resource15.save();
            resource15.release();
            resource15.load();
            resource15.getInfo();

            Asset asset=new Asset();
            asset.load();
            asset.save();
            asset.refresh();
            asset.release();
            asset.getInfo();

        System.out.println("Content _________________________________");
            Resource resource16=new Content();
            resource16.refresh();
            resource16.save();
            resource16.release();
            resource16.load();
            resource16.getInfo();

            Content content=new Content();
            content.load();
            content.save();
            content.refresh();
            content.release();
            content.getInfo();

        System.out.println("Data _________________________________");
            Resource resource17=new Data();
            resource17.refresh();
            resource17.save();
            resource17.release();
            resource17.load();
            resource17.getInfo();

            Data data=new Data();
            data.load();
            data.save();
            data.refresh();
            data.release();
            data.getInfo();

        System.out.println("Credential _________________________________");
            Resource resource18=new Credential();
            resource18.refresh();
            resource18.save();
            resource18.release();
            resource18.load();
            resource18.getInfo();

            Credential credential=new Credential();
            credential.load();
            credential.save();
            credential.refresh();
            credential.release();
            credential.getInfo();

        System.out.println("End Point _________________________________");
            Resource resource19=new Endpoint();
            resource19.refresh();
            resource19.save();
            resource19.release();
            resource19.load();
            resource19.getInfo();

            Endpoint endpoint=new Endpoint();
            endpoint.load();
            endpoint.save();
            endpoint.refresh();
            endpoint.release();
            endpoint.getInfo();

        System.out.println("API _________________________________");
            Resource resource20=new API();
            resource20.refresh();
            resource20.save();
            resource20.release();
            resource20.load();
            resource20.getInfo();

            API api=new API();
            api.load();
            api.save();
            api.refresh();
            api.release();
            api.getInfo();

        System.out.println("-----------------------------------------------------------------------------------------");

            System.out.println("Invoking Parent class");
            Component component=new Component();
            component.render();
            component.resize();
            component.click();
            component.enable();
            component.disable();
        System.out.println("Button _________________________________");

            Component component1=new Button();
            component1.render();
            component1.resize();
            component1.click();
            component1.enable();
            component1.disable();

            Button button=new Button();
            button.render();
            button.resize();
            button.click();
            button.enable();
            button.disable();

        System.out.println("Canvas _________________________________");

            Component component2=new Canvas();
            component2.render();
            component2.resize();
            component2.click();
            component2.enable();
            component2.disable();

            Canvas canvas=new Canvas();
            canvas.render();
            canvas.resize();
            canvas.click();
            canvas.enable();
            canvas.disable();

        System.out.println("Card _________________________________");

            Component component3=new Card();
            component3.render();
            component3.resize();
            component3.click();
            component3.enable();
            component3.disable();

            Card card=new Card();
            card.render();
            card.resize();
            card.click();
            card.enable();
            card.disable();

        System.out.println("Check Box _________________________________");

            Component component4=new Checkbox();
            component4.render();
            component4.resize();
            component4.click();
            component4.enable();
            component4.disable();

            Checkbox checkbox=new Checkbox();
            checkbox.render();
            checkbox.resize();
            checkbox.click();
            checkbox.enable();
            checkbox.disable();

        System.out.println("Dialog _________________________________");

            Component component5=new Dialog();
            component5.render();
            component5.resize();
            component5.click();
            component5.enable();
            component5.disable();

            Dialog dialog=new Dialog();
            dialog.render();
            dialog.resize();
            dialog.click();
            dialog.enable();
            dialog.disable();

        System.out.println("Drop Down _________________________________");

            Component component6=new Dropdown();
            component6.render();
            component6.resize();
            component6.click();
            component6.enable();
            component6.disable();

            Dropdown dropdown=new Dropdown();
            dropdown.render();
            dropdown.resize();
            dropdown.click();
            dropdown.enable();
            dropdown.disable();

        System.out.println("Footer _________________________________");

            Component component7=new Footer();
            component7.render();
            component7.resize();
            component7.click();
            component7.enable();
            component7.disable();

            Footer footer=new Footer();
            footer.render();
            footer.resize();
            footer.click();
            footer.enable();
            footer.disable();

        System.out.println("Frame _________________________________");

            Component component8=new Frame();
            component8.render();
            component8.resize();
            component8.click();
            component8.enable();
            component8.disable();

            Frame frame=new Frame();
            frame.render();
            frame.resize();
            frame.click();
            frame.enable();
            frame.disable();

        System.out.println("Canvas _________________________________");

            Component component9=new Grid();
            component9.render();
            component9.resize();
            component9.click();
            component9.enable();
            component9.disable();

            Grid grid=new Grid();
            grid.render();
            grid.resize();
            grid.click();
            grid.enable();
            grid.disable();

        System.out.println("Header _________________________________");

            Component component10=new Header();
            component10.render();
            component10.resize();
            component10.click();
            component10.enable();
            component10.disable();

            Header header=new Header();
            header.render();
            header.resize();
            header.click();
            header.enable();
            header.disable();

        System.out.println("Label _________________________________");

            Component component11=new Label();
            component11.render();
            component11.resize();
            component11.click();
            component11.enable();
            component11.disable();

            Label label=new Label();
            label.render();
            label.resize();
            label.click();
            label.enable();
            label.disable();

        System.out.println("List View _________________________________");

            Component component12=new ListView();
            component12.render();
            component12.resize();
            component12.click();
            component12.enable();
            component12.disable();

            ListView listView=new ListView();
            listView.render();
            listView.resize();
            listView.click();
            listView.enable();
            listView.disable();

        System.out.println("Menu _________________________________");

            Component component13=new Menu();
            component13.render();
            component13.resize();
            component13.click();
            component13.enable();
            component13.disable();

            Menu menu=new Menu();
            menu.render();
            menu.resize();
            menu.click();
            menu.enable();
            menu.disable();

        System.out.println("Menu Item _________________________________");

            Component component14=new MenuItem();
            component14.render();
            component14.resize();
            component14.click();
            component14.enable();
            component14.disable();

            MenuItem menuItem=new MenuItem();
            menuItem.render();
            menuItem.resize();
            menuItem.click();
            menuItem.enable();
            menuItem.disable();

        System.out.println("Navigator _________________________________");

            Component component15=new NavigationBar();
            component15.render();
            component15.resize();
            component15.click();
            component15.enable();
            component15.disable();

            NavigationBar navigationBar=new NavigationBar();
            navigationBar.render();
            navigationBar.resize();
            navigationBar.click();
            navigationBar.enable();
            navigationBar.disable();

        System.out.println("Panel _________________________________");

            Component component16=new Panel();
            component16.render();
            component16.resize();
            component16.click();
            component16.enable();
            component16.disable();

            Panel panel=new Panel();
            panel.render();
            panel.resize();
            panel.click();
            panel.enable();
            panel.disable();

        System.out.println("Progress Bar _________________________________");

            Component component17=new ProgressBar();
            component17.render();
            component17.resize();
            component17.click();
            component17.enable();
            component17.disable();

            ProgressBar progressBar=new ProgressBar();
            progressBar.render();
            progressBar.resize();
            progressBar.click();
            progressBar.enable();
            progressBar.disable();

        System.out.println("Radio Button _________________________________");

            Component component18=new RadioButton();
            component18.render();
            component18.resize();
            component18.click();
            component18.enable();
            component18.disable();

            RadioButton radioButton=new RadioButton();
            radioButton.render();
            radioButton.resize();
            radioButton.click();
            radioButton.enable();
            radioButton.disable();

        System.out.println("Side Bar _________________________________");

            Component component19=new SideBar();
            component19.render();
            component19.resize();
            component19.click();
            component19.enable();
            component19.disable();

            SideBar sideBar=new SideBar();
            sideBar.render();
            sideBar.resize();
            sideBar.click();
            sideBar.enable();
            sideBar.disable();

        System.out.println("Slider _________________________________");

            Component component20=new Slider();
            component20.render();
            component20.resize();
            component20.click();
            component20.enable();
            component20.disable();

            Slider slider=new Slider();
            slider.render();
            slider.resize();
            slider.click();
            slider.enable();
            slider.disable();

        System.out.println("Spinner _________________________________");

            Component component21=new Spinner();
            component21.render();
            component21.resize();
            component21.click();
            component21.enable();
            component21.disable();

            Spinner spinner=new Spinner();
            spinner.render();
            spinner.resize();
            spinner.click();
            spinner.enable();
            spinner.disable();

        System.out.println("Status Bar _________________________________");

            Component component22=new StatusBar();
            component22.render();
            component22.resize();
            component22.click();
            component22.enable();
            component22.disable();

            StatusBar statusBar=new StatusBar();
            statusBar.render();
            statusBar.resize();
            statusBar.click();
            statusBar.enable();
            statusBar.disable();

        System.out.println("Tab _________________________________");

            Component component23=new Tab();
            component23.render();
            component23.resize();
            component23.click();
            component23.enable();
            component23.disable();

            Tab tab=new Tab();
            tab.render();
            tab.resize();
            tab.click();
            tab.enable();
            tab.disable();

        System.out.println("Table _________________________________");

            Component component24=new Table();
            component24.render();
            component24.resize();
            component24.click();
            component24.enable();
            component24.disable();

            Table table=new Table();
            table.render();
            table.resize();
            table.click();
            table.enable();
            table.disable();

        System.out.println("Text Field _________________________________");

            Component component25=new TextField();
            component25.render();
            component25.resize();
            component25.click();
            component25.enable();
            component25.disable();

            TextField textField=new TextField();
            textField.render();
            textField.resize();
            textField.click();
            textField.enable();
            textField.disable();

        System.out.println("Toast _________________________________");

            Component component26=new Toast();
            component26.render();
            component26.resize();
            component26.click();
            component26.enable();
            component26.disable();

            Toast toast=new Toast();
            toast.render();
            toast.resize();
            toast.click();
            toast.enable();
            toast.disable();

        System.out.println("Tool Bar _________________________________");

            Component component27=new Toolbar();
            component27.render();
            component27.resize();
            component27.click();
            component27.enable();
            component27.disable();

            Toolbar toolbar=new Toolbar();
            toolbar.render();
            toolbar.resize();
            toolbar.click();
            toolbar.enable();
            toolbar.disable();

        System.out.println("Tool Bar _________________________________");

            Component component28=new Tooltip();
            component28.render();
            component28.resize();
            component28.click();
            component28.enable();
            component28.disable();

            Tooltip tooltip=new Tooltip();
            tooltip.render();
            tooltip.resize();
            tooltip.click();
            tooltip.enable();
            tooltip.disable();

        System.out.println("Tree View _________________________________");

            Component component29=new TreeView();
            component29.render();
            component29.resize();
            component29.click();
            component29.enable();
            component29.disable();

            TreeView treeView=new TreeView();
            treeView.render();
            treeView.resize();
            treeView.click();
            treeView.enable();
            treeView.disable();

        System.out.println("Window _________________________________");

            Component component30=new Window();
            component30.render();
            component30.resize();
            component30.click();
            component30.enable();
            component30.disable();

            Window window=new Window();
            window.render();
            window.resize();
            window.click();
            window.enable();
            window.disable();
        System.out.println("____________________________________________________________________________________");

        System.out.println("Invoking Parent class");
            Model model=new Model();
            model.walk();
            model.dance();
            model.pose();
            model.design();
            model.display();


        System.out.println("Chiranjeevi _________________________________");
        Model model1 = new Chiranjeevi();
        model1.walk();
        model1.dance();
        model1.pose();
        model1.design();
        model1.display();
        Chiranjeevi chiranjeevi = new Chiranjeevi();
        chiranjeevi.walk();
        chiranjeevi.dance();
        chiranjeevi.pose();
        chiranjeevi.design();
        chiranjeevi.display();

        System.out.println("NagarjunaAkkineni _________________________________");
        Model model2 = new Nagarjuna();
        model2.walk();
        model2.dance();
        model2.pose();
        model2.design();
        model2.display();
        Nagarjuna nagarjuna = new Nagarjuna();
        nagarjuna.walk();
        nagarjuna.dance();
        nagarjuna.pose();
        nagarjuna.design();
        nagarjuna.display();

        System.out.println("VenkateshDaggubati _________________________________");
        Model model3 = new Venkatesh();
        model3.walk();
        model3.dance();
        model3.pose();
        model3.design();
        model3.display();
        Venkatesh venkatesh = new Venkatesh();
        venkatesh.walk();
        venkatesh.dance();
        venkatesh.pose();
        venkatesh.design();
        venkatesh.display();

        System.out.println("Balakrishna _________________________________");
        Model model4 = new Balakrishna();
        model4.walk();
        model4.dance();
        model4.pose();
        model4.design();
        model4.display();
        Balakrishna balakrishna = new Balakrishna();
        balakrishna.walk();
        balakrishna.dance();
        balakrishna.pose();
        balakrishna.design();
        balakrishna.display();

        System.out.println("PawanKalyan _________________________________");
        Model model5 = new PawanKalyan();
        model5.walk();
        model5.dance();
        model5.pose();
        model5.design();
        model5.display();
        PawanKalyan pawanKalyan = new PawanKalyan();
        pawanKalyan.walk();
        pawanKalyan.dance();
        pawanKalyan.pose();
        pawanKalyan.design();
        pawanKalyan.display();

        System.out.println("MaheshBabu _________________________________");
        Model model6 = new MaheshBabu();
        model6.walk();
        model6.dance();
        model6.pose();
        model6.design();
        model6.display();
        MaheshBabu maheshBabu = new MaheshBabu();
        maheshBabu.walk();
        maheshBabu.dance();
        maheshBabu.pose();
        maheshBabu.design();
        maheshBabu.display();

        System.out.println("JrNTR _________________________________");
        Model model7 = new JrNTR();
        model7.walk();
        model7.dance();
        model7.pose();
        model7.design();
        model7.display();
        JrNTR jrNTR = new JrNTR();
        jrNTR.walk();
        jrNTR.dance();
        jrNTR.pose();
        jrNTR.design();
        jrNTR.display();

        System.out.println("RamCharan _________________________________");
        Model model8 = new RamCharan();
        model8.walk();
        model8.dance();
        model8.pose();
        model8.design();
        model8.display();
        RamCharan ramCharan = new RamCharan();
        ramCharan.walk();
        ramCharan.dance();
        ramCharan.pose();
        ramCharan.design();
        ramCharan.display();

        System.out.println("AlluArjun _________________________________");
        Model model9 = new AlluArjun();
        model9.walk();
        model9.dance();
        model9.pose();
        model9.design();
        model9.display();
        AlluArjun alluArjun = new AlluArjun();
        alluArjun.walk();
        alluArjun.dance();
        alluArjun.pose();
        alluArjun.design();
        alluArjun.display();

        System.out.println("Prabhas _________________________________");
        Model model10 = new Prabhas();
        model10.walk();
        model10.dance();
        model10.pose();
        model10.design();
        model10.display();
        Prabhas prabhas = new Prabhas();
        prabhas.walk();
        prabhas.dance();
        prabhas.pose();
        prabhas.design();
        prabhas.display();

        System.out.println("Nithiin _________________________________");
        Model model11 = new Nithiin();
        model11.walk();
        model11.dance();
        model11.pose();
        model11.design();
        model11.display();
        Nithiin nithiin = new Nithiin();
        nithiin.walk();
        nithiin.dance();
        nithiin.pose();
        nithiin.design();
        nithiin.display();

        System.out.println("VijayDeverakonda _________________________________");
        Model model12 = new VijayDeverakonda();
        model12.walk();
        model12.dance();
        model12.pose();
        model12.design();
        model12.display();
        VijayDeverakonda vijayDeverakonda = new VijayDeverakonda();
        vijayDeverakonda.walk();
        vijayDeverakonda.dance();
        vijayDeverakonda.pose();
        vijayDeverakonda.design();
        vijayDeverakonda.display();

        System.out.println("Nani _________________________________");
        Model model13 = new Nani();
        model13.walk();
        model13.dance();
        model13.pose();
        model13.design();
        model13.display();
        Nani nani = new Nani();
        nani.walk();
        nani.dance();
        nani.pose();
        nani.design();
        nani.display();

        System.out.println("SaiDharamTej _________________________________");
        Model model14 = new SaiDharamTej();
        model14.walk();
        model14.dance();
        model14.pose();
        model14.design();
        model14.display();
        SaiDharamTej saiDharamTej = new SaiDharamTej();
        saiDharamTej.walk();
        saiDharamTej.dance();
        saiDharamTej.pose();
        saiDharamTej.design();
        saiDharamTej.display();

        System.out.println("VarunTej _________________________________");
        Model model15 = new VarunTej();
        model15.walk();
        model15.dance();
        model15.pose();
        model15.design();
        model15.display();
        VarunTej varunTej = new VarunTej();
        varunTej.walk();
        varunTej.dance();
        varunTej.pose();
        varunTej.design();
        varunTej.display();

        System.out.println("AkhilAkkineni _________________________________");
        Model model16 = new AkhilAkkineni();
        model16.walk();
        model16.dance();
        model16.pose();
        model16.design();
        model16.display();
        AkhilAkkineni akhilAkkineni = new AkhilAkkineni();
        akhilAkkineni.walk();
        akhilAkkineni.dance();
        akhilAkkineni.pose();
        akhilAkkineni.design();
        akhilAkkineni.display();

        System.out.println("Sharwanand _________________________________");
        Model model17 = new Sharwanand();
        model17.walk();
        model17.dance();
        model17.pose();
        model17.design();
        model17.display();
        Sharwanand sharwanand = new Sharwanand();
        sharwanand.walk();
        sharwanand.dance();
        sharwanand.pose();
        sharwanand.design();
        sharwanand.display();

        System.out.println("KarthikeyaGummakonda _________________________________");
        Model model18 = new KarthikeyaGummakonda();
        model18.walk();
        model18.dance();
        model18.pose();
        model18.design();
        model18.display();
        KarthikeyaGummakonda karthikeyaGummakonda = new KarthikeyaGummakonda();
        karthikeyaGummakonda.walk();
        karthikeyaGummakonda.dance();
        karthikeyaGummakonda.pose();
        karthikeyaGummakonda.design();
        karthikeyaGummakonda.display();

        System.out.println("SundeepKishan _________________________________");
        Model model19 = new SundeepKishan();
        model19.walk();
        model19.dance();
        model19.pose();
        model19.design();
        model19.display();
        SundeepKishan sundeepKishan = new SundeepKishan();
        sundeepKishan.walk();
        sundeepKishan.dance();
        sundeepKishan.pose();
        sundeepKishan.design();
        sundeepKishan.display();

        System.out.println("Aryan _________________________________");

        Model model20=new Aryan();
        model20.walk();
        model20.dance();
        model20.pose();
        model20.design();
        model20.display();

        Aryan aryan=new Aryan();
        aryan.walk();
        aryan.dance();
        aryan.pose();
        aryan.design();
        aryan.display();

        System.out.println("Shashank _________________________________");

        Model model21=new Shashank();
        model21.walk();
        model21.dance();
        model21.pose();
        model21.design();
        model21.display();

        Shashank shashank=new Shashank();
        shashank.walk();
        shashank.dance();
        shashank.pose();
        shashank.design();
        shashank.display();

        System.out.println("Sanjana _________________________________");

        Model model22=new Sanjana();
        model22.walk();
        model22.dance();
        model22.pose();
        model22.design();
        model22.display();

        Sanjana sanjana=new Sanjana();
        sanjana.walk();
        sanjana.dance();
        sanjana.pose();
        sanjana.design();
        sanjana.display();

        System.out.println("____________________________________________________________________________________");

        System.out.println("Invoking Parent class");
        Product product=new Product();
        product.displayDetails();
        product.calculateDiscount();
        product.checkAvailability();
        product.addToCart();
        product.purchase();

        System.out.println("Smartphone _________________________________");
        Product product1 = new Smartphone();
        product1.displayDetails();
        product1.calculateDiscount();
        product1.checkAvailability();
        product1.addToCart();
        product1.purchase();
        Smartphone smartphone = new Smartphone();
        smartphone.displayDetails();
        smartphone.calculateDiscount();
        smartphone.checkAvailability();
        smartphone.addToCart();
        smartphone.purchase();

        System.out.println("Laptop _________________________________");
        Product product2 = new Laptop();
        product2.displayDetails();
        product2.calculateDiscount();
        product2.checkAvailability();
        product2.addToCart();
        product2.purchase();
        Laptop laptop = new Laptop();
        laptop.displayDetails();
        laptop.calculateDiscount();
        laptop.checkAvailability();
        laptop.addToCart();
        laptop.purchase();

        System.out.println("Smartwatch _________________________________");
        Product product3 = new Smartwatch();
        product3.displayDetails();
        product3.calculateDiscount();
        product3.checkAvailability();
        product3.addToCart();
        product3.purchase();
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.displayDetails();
        smartwatch.calculateDiscount();
        smartwatch.checkAvailability();
        smartwatch.addToCart();
        smartwatch.purchase();

        System.out.println("WirelessEarbuds _________________________________");
        Product product4 = new WirelessEarbuds();
        product4.displayDetails();
        product4.calculateDiscount();
        product4.checkAvailability();
        product4.addToCart();
        product4.purchase();
        WirelessEarbuds wirelessEarbuds = new WirelessEarbuds();
        wirelessEarbuds.displayDetails();
        wirelessEarbuds.calculateDiscount();
        wirelessEarbuds.checkAvailability();
        wirelessEarbuds.addToCart();
        wirelessEarbuds.purchase();

        System.out.println("Tablet _________________________________");
        Product product5 = new Tablet();
        product5.displayDetails();
        product5.calculateDiscount();
        product5.checkAvailability();
        product5.addToCart();
        product5.purchase();
        Tablet tablet = new Tablet();
        tablet.displayDetails();
        tablet.calculateDiscount();
        tablet.checkAvailability();
        tablet.addToCart();
        tablet.purchase();

        System.out.println("Refrigerator _________________________________");
        Product product6 = new Refrigerator();
        product6.displayDetails();
        product6.calculateDiscount();
        product6.checkAvailability();
        product6.addToCart();
        product6.purchase();
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.displayDetails();
        refrigerator.calculateDiscount();
        refrigerator.checkAvailability();
        refrigerator.addToCart();
        refrigerator.purchase();

        System.out.println("WashingMachine _________________________________");
        Product product7 = new WashingMachine();
        product7.displayDetails();
        product7.calculateDiscount();
        product7.checkAvailability();
        product7.addToCart();
        product7.purchase();
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.displayDetails();
        washingMachine.calculateDiscount();
        washingMachine.checkAvailability();
        washingMachine.addToCart();
        washingMachine.purchase();

        System.out.println("MicrowaveOven _________________________________");
        Product product8 = new MicrowaveOven();
        product8.displayDetails();
        product8.calculateDiscount();
        product8.checkAvailability();
        product8.addToCart();
        product8.purchase();
        MicrowaveOven microwaveOven = new MicrowaveOven();
        microwaveOven.displayDetails();
        microwaveOven.calculateDiscount();
        microwaveOven.checkAvailability();
        microwaveOven.addToCart();
        microwaveOven.purchase();

        System.out.println("AirConditioner _________________________________");
        Product product9 = new AirConditioner();
        product9.displayDetails();
        product9.calculateDiscount();
        product9.checkAvailability();
        product9.addToCart();
        product9.purchase();
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.displayDetails();
        airConditioner.calculateDiscount();
        airConditioner.checkAvailability();
        airConditioner.addToCart();
        airConditioner.purchase();

        System.out.println("VacuumCleaner _________________________________");
        Product product10 = new VacuumCleaner();
        product10.displayDetails();
        product10.calculateDiscount();
        product10.checkAvailability();
        product10.addToCart();
        product10.purchase();
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.displayDetails();
        vacuumCleaner.calculateDiscount();
        vacuumCleaner.checkAvailability();
        vacuumCleaner.addToCart();
        vacuumCleaner.purchase();

        System.out.println("ElectricScooter _________________________________");
        Product product11 = new ElectricScooter();
        product11.displayDetails();
        product11.calculateDiscount();
        product11.checkAvailability();
        product11.addToCart();
        product11.purchase();
        ElectricScooter electricScooter = new ElectricScooter();
        electricScooter.displayDetails();
        electricScooter.calculateDiscount();
        electricScooter.checkAvailability();
        electricScooter.addToCart();
        electricScooter.purchase();

        System.out.println("CarDashboardCamera _________________________________");
        Product product12 = new CarDashboardCamera();
        product12.displayDetails();
        product12.calculateDiscount();
        product12.checkAvailability();
        product12.addToCart();
        product12.purchase();
        CarDashboardCamera carDashboardCamera = new CarDashboardCamera();
        carDashboardCamera.displayDetails();
        carDashboardCamera.calculateDiscount();
        carDashboardCamera.checkAvailability();
        carDashboardCamera.addToCart();
        carDashboardCamera.purchase();

        System.out.println("GPSTracker _________________________________");
        Product product13 = new GPSTracker();
        product13.displayDetails();
        product13.calculateDiscount();
        product13.checkAvailability();
        product13.addToCart();
        product13.purchase();
        GPSTracker gpsTracker = new GPSTracker();
        gpsTracker.displayDetails();
        gpsTracker.calculateDiscount();
        gpsTracker.checkAvailability();
        gpsTracker.addToCart();
        gpsTracker.purchase();

        System.out.println("BluetoothCarAdapter _________________________________");
        Product product14 = new BluetoothCarAdapter();
        product14.displayDetails();
        product14.calculateDiscount();
        product14.checkAvailability();
        product14.addToCart();
        product14.purchase();
        BluetoothCarAdapter bluetoothCarAdapter = new BluetoothCarAdapter();
        bluetoothCarAdapter.displayDetails();
        bluetoothCarAdapter.calculateDiscount();
        bluetoothCarAdapter.checkAvailability();
        bluetoothCarAdapter.addToCart();
        bluetoothCarAdapter.purchase();

        System.out.println("Sneakers _________________________________");
        Product product16 = new Sneakers();
        product16.displayDetails();
        product16.calculateDiscount();
        product16.checkAvailability();
        product16.addToCart();
        product16.purchase();
        Sneakers sneakers = new Sneakers();
        sneakers.displayDetails();
        sneakers.calculateDiscount();
        sneakers.checkAvailability();
        sneakers.addToCart();
        sneakers.purchase();

        System.out.println("LeatherJacket _________________________________");
        Product product17 = new LeatherJacket();
        product17.displayDetails();
        product17.calculateDiscount();
        product17.checkAvailability();
        product17.addToCart();
        product17.purchase();
        LeatherJacket leatherJacket = new LeatherJacket();
        leatherJacket.displayDetails();
        leatherJacket.calculateDiscount();
        leatherJacket.checkAvailability();
        leatherJacket.addToCart();
        leatherJacket.purchase();

        System.out.println("DesignerHandbag _________________________________");
        Product product18 = new DesignerHandbag();
        product18.displayDetails();
        product18.calculateDiscount();
        product18.checkAvailability();
        product18.addToCart();
        product18.purchase();
        DesignerHandbag designerHandbag = new DesignerHandbag();
        designerHandbag.displayDetails();
        designerHandbag.calculateDiscount();
        designerHandbag.checkAvailability();
        designerHandbag.addToCart();
        designerHandbag.purchase();

        System.out.println("Sunglasses _________________________________");
        Product product19 = new Sunglasses();
        product19.displayDetails();
        product19.calculateDiscount();
        product19.checkAvailability();
        product19.addToCart();
        product19.purchase();
        Sunglasses sunglasses = new Sunglasses();
        sunglasses.displayDetails();
        sunglasses.calculateDiscount();
        sunglasses.checkAvailability();
        sunglasses.addToCart();
        sunglasses.purchase();

        System.out.println("SmartFitnessBand _________________________________");
        Product product20 = new SmartFitnessBand();
        product20.displayDetails();
        product20.calculateDiscount();
        product20.checkAvailability();
        product20.addToCart();
        product20.purchase();
        SmartFitnessBand smartFitnessBand = new SmartFitnessBand();
        smartFitnessBand.displayDetails();
        smartFitnessBand.calculateDiscount();
        smartFitnessBand.checkAvailability();
        smartFitnessBand.addToCart();
        smartFitnessBand.purchase();

    }
}
