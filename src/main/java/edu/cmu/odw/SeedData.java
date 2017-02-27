package edu.cmu.odw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.odw.model.Address;
import edu.cmu.odw.service.AddressService;



@Configuration
public class SeedData {	
    
	@Autowired
	AddressService addressService;
    
    private static final Logger log = LoggerFactory.getLogger(SeedData.class);

    @Bean
    public SeedData getBean() {        

    	Address a1 = new Address(new Long(1), "6021 Centre Ave", "Pittsburgh", "PA", "15206","USA",40.4512826,-79.9320833);
    	Address a2 = new Address(new Long(2), "366 Atwood St", "Pittsburgh", "PA", "15213","USA",40.4377456,-79.9640405);
    	Address a3 = new Address(new Long(3), "5532 Walnut St", "Pittsburgh", "PA", "15232","USA",40.4517604,-79.9359249);
    	Address a4 = new Address(new Long(4), "5775 Baum Blvd", "Pittsburgh", "PA", "15206","USA",40.4548273,-79.952001);
    	Address a5 = new Address(new Long(5), "518 Mellon St", "Pittsburgh", "PA", "15206","USA",40.4548273,-79.952001);
    	Address a6 = new Address(new Long(6), "4301 Main St", "Pittsburgh", "PA", "15224","USA",40.4548273,-79.952001);
    	Address a7 = new Address(new Long(7), "4510 Henry St", "Pittsburgh", "PA", "15213","USA",40.4529986,-79.9513144);
    	Address a8 = new Address(new Long(8), "3529 Boulevard of the Allies", "Pittsburgh", "PA", "15213","USA",40.4529986,-79.9513144);
    	Address a9 = new Address(new Long(9), "4157 Murray Ave", "Pittsburgh", "PA", "15217","USA",40.4501396,-79.9515921);
    	Address a10 = new Address(new Long(10), "3614 Forbes Ave", "Pittsburgh", "PA", "15213","USA",40.4407818,-79.9578576);
    	Address a11 = new Address(new Long(11), "4815 Centre Ave #103", "Pittsburgh", "PA", "15213","USA",40.4548283,-79.952001);    	
    	   
        
        addressService.save(a1);
        addressService.save(a2);
        addressService.save(a3);
        addressService.save(a4);
        addressService.save(a5);
        addressService.save(a6);
        addressService.save(a7);
        addressService.save(a8);
        addressService.save(a9);
        addressService.save(a10);
        addressService.save(a11);
        
        log.info("Address found with findAll():");
        log.info("-------------------------------");
        for (Address b : addressService.findAll()) {
            log.info(b.toString());
        }
        return new SeedData();
    }
}