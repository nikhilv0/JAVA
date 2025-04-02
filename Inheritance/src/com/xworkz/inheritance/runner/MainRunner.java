package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.*;

public class MainRunner {
    public static void main(String[] args) {

        System.out.println("File _________________________________");
        System.out.println("Invoking Parent class");
        Resource resource=new Resource();
            resource.getInfo();
            resource.load();
            resource.release();
            resource.save();
            resource.refresh();

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

    }
}
