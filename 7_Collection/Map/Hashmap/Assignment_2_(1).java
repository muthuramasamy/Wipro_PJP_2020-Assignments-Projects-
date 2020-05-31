System.out.println("Enter the key to check: ");
		String key = sc.nextLine();
		Set set1 = hm.entrySet();
		Iterator i1 = set1.iterator();
		while(i1.hasNext())
		{
			Map.Entry me1 =(Map.Entry) i1.next();
			if(me1.getKey().equals(key))
			{
				System.out.println("KEY FOUNDED");
				break;
			}
			else
			{
				System.out.println("KEY NOT FOUNDED");
			}
			
		}
