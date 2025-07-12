package com.xworkz.collection.set;
import com.xworkz.collection.DTO.DTO;

import java.util.HashSet;
import java.util.Set;


public class ExampleForSet {

        public void save(){
            Set<DTO> set=new HashSet<>();
            set.add(new DTO("Davanger","benne Dosa",120L,1999));
            set.add(new DTO("Davanger","benne Dosa",120L,1999));
            set.add(new DTO("Mysore","pak",5L,2000));
            set.add(new DTO("Bangolre","dont know",120L,1223));

            set.forEach((e)-> System.out.println(e));

        }
}
