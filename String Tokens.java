 Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
       if (s == null || s.trim().equals("")) {
           System.out.println("0");
 }
        else if(s.length() > 400000)
             return;
      else
      {
        String pattern = "[ !,?.\\_'@]+";
        String[] tokens = s.trim().split(pattern);
        System.out.println(tokens.length);
         for (String a: tokens)
            System.out.println(a);
      } 
        scan.close();
