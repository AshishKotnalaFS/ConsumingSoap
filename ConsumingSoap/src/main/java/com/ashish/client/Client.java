package com.ashish.client;

import java.net.MalformedURLException;
import java.net.URL;
import com.thomas_bayer.blz.BLZService;
import com.thomas_bayer.blz.BLZServicePortType;
import com.thomas_bayer.blz.DetailsType;
import com.thomas_bayer.blz.GetBankType;

public class Client {

	public static void main(String[] args) throws MalformedURLException {

		BLZService blzService = new BLZService(new URL("http://www.thomas-bayer.com/axis2/services/BLZService?wsdl"));
		BLZServicePortType blzServiceHttpport = blzService.getBLZServiceHttpport();

		GetBankType bankType = new GetBankType();
		bankType.setBlz("40370079");
		DetailsType bank = blzServiceHttpport.getBank("40370079");
		System.out.println(("OUTPUT"));
		System.out.println(bank.getBezeichnung());
		System.out.println(bank.getBic());
		System.out.println(bank.getOrt());

	}

}
