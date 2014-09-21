package me.kirby2ig.firstplugin;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class Gpioclass {
	
	final GpioController gpio = GpioFactory.getInstance();
    GpioPinDigitalOutput o1;
    GpioPinDigitalOutput o2;
    GpioPinDigitalOutput o3;
    GpioPinDigitalOutput o4;
    GpioPinDigitalOutput o5;
    GpioPinDigitalOutput o6;
    GpioPinDigitalOutput o7;
    GpioPinDigitalOutput o8;
    GpioPinDigitalOutput o9;
    GpioPinDigitalOutput o10;
    GpioPinDigitalOutput o11;
    GpioPinDigitalOutput o12;
    GpioPinDigitalOutput o13;
    GpioPinDigitalOutput o14;
    GpioPinDigitalOutput o15;
    GpioPinDigitalOutput o16; 
    
	public Gpioclass() {
	    o1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);
	    o2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02);
	    o3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03);
	    o4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04);
	    o5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05);
	    o6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06);
	    o7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07);
	    o8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08);
	    o9 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09);
	    o10 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10);
	    o11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11);
	    o12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12);
	    o13 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13);
	    o14 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14);
	    o15 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15);
	    o16 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16);
	}
	
	public void Output(final int i, final boolean b) {
        
		
		
		if (b) {
            if (i == 1) {
                o1.high();
            }
            else if (i == 2) {
                o2.high();
            }
            else if (i == 3) {
                o3.high();
            }
            else if (i == 4) {
                o4.high();
            }
            else if (i == 5) {
                o5.high();
            }
            else if (i == 6) {
                o6.high();
            }
            else if (i == 7) {
                o7.high();
            }
            else if (i == 8) {
                o8.high();
            }
            else if (i == 9) {
                o9.high();
            }
            else if (i == 10) {
                o10.high();
            }
            else if (i == 11) {
                o11.high();
            }
            else if (i == 12) {
                o12.high();
            }
            else if (i == 13) {
                o13.high();
            }
            else if (i == 14) {
                o14.high();
            }
            else if (i == 15) {
                o15.high();
            }
            else if (i == 16) {
                o16.high();
            }
        }
        else if (!b) {
            if (i == 1) {
                o1.low();
            }
            else if (i == 2) {
                o2.low();
            }
            else if (i == 3) {
                o3.low();
            }
            else if (i == 4) {
                o4.low();
            }
            else if (i == 5) {
                o5.low();
            }
            else if (i == 6) {
                o6.low();
            }
            else if (i == 7) {
                o7.low();
            }
            else if (i == 8) {
                o8.low();
            }
            else if (i == 9) {
                o9.low();
            }
            else if (i == 10) {
                o10.low();
            }
            else if (i == 11) {
                o11.low();
            }
            else if (i == 12) {
                o12.low();
            }
            else if (i == 13) {
                o13.low();
            }
            else if (i == 14) {
                o14.low();
            }
            else if (i == 15) {
                o15.low();
            }
            else if (i == 16) {
                o16.low();
            }
        }
	}
        

}
