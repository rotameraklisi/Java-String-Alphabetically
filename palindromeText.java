Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int counter = 0;
        for(int i = 0;i<A.length()-1;i++)
              {
                  if(A.charAt(i) != A.charAt((A.length()-1)-i))
                            counter++;
                            break;
                      }
        if(counter==0)
            System.out.print("Yes");
        else
            System.out.print("No");
