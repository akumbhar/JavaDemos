package com.learn.demos.solid.isp;

public class InterfaceSegregationPrinciple {
	
	// bad example
	
	/*interface ISmartDevice{
		void scan();
		void print();
		void fax();
	}
	
	class PrinterDevice implements ISmartDevice{

		@Override
		public void scan() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fax() {
			// TODO Auto-generated method stub
			throw new UnsupportedException("Not supported!!");
			
		}
		
	}*/
	
	// Good example
	
	
	interface IScanner{
		void scan();
	}
	
	interface IPrinter{
		void print();
	}
	
	interface IFax{
		void fax();
	}
	
	class NormalPrinter implements IScanner, IPrinter{

		@Override
		public void print() {
			
			System.out.println("Printer");
		}

		@Override
		public void scan() {
			
			System.out.println("Scan");
		}
		
	}
	
	class AllInOnePrinter implements IScanner, IFax, IPrinter{

		@Override
		public void print() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void fax() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void scan() {
			// TODO Auto-generated method stub
			
		}
		
	}
	

}
