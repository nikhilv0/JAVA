package com.xworkz.collection.list;

import com.xworkz.collection.DTO.DTO;

import java.util.ArrayList;
import java.util.List;

public class ExampleForList {
    public void run(){
        List<DTO> list=new ArrayList<>();
        list.add(new DTO("Davanger","benne Dosa",120L,1999));
        list.add(new DTO("Mysore","pak",5L,2000));
        list.add(new DTO("Bangolre","dont know",120L,1999));
        list.add(new DTO("Davanger","benne Dosa",120L,1999));

        list.forEach((e)-> System.out.println(e));

    }
}
