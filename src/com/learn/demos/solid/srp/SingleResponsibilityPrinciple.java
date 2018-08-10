package com.learn.demos.solid.srp;

public class SingleResponsibilityPrinciple {

	// bad
	/*class Customer {

		private String name;

		public String getName() {

			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void storeCustomer(String name) {

			// store customer
		}

		public void generateCustomerReport(int customerId) {

			// generate customer report

		}

	}*/

	///////////////////////// Good
	class Customer {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	class CustomerDB {

		public void storeCustomer(String name) {

			// store customer
		}

	}

	class ReportGenerator {
		public void generateCustomerReport(int customerId) {

			// generate customer report

		}

	}

}
