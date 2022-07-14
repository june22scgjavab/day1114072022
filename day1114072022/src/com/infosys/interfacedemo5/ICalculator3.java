package com.infosys.interfacedemo5;

import com.infosys.interfacedemo3.ICalculator1;
import com.infosys.interfacedemo3.ICalculator2;

public interface ICalculator3 extends ICalculator1, ICalculator2 {
public void display();
}
