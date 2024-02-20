package ihihihi;

//3:26
import java.util.Scanner;
	public class lab2<T> {
	    private Object[] elements;
	    private int size;
	    private static final int DEFAULT_CAPACITY = 10;

	    public lab2() {
	        elements = new Object[DEFAULT_CAPACITY];
	        size = 0;
	    }

	    public void add(T element) {
	        elements[size++] = element;
	    }

	    public T get(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        return (T) elements[index];
	    }

	    public int size() {
	        return size;
	    }

	    public void remove(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
	        size--;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lab2<B> blist = new lab2<>();
		Scanner sc = new Scanner(System.in);
		boolean a=true;
		while(true)
		{
			System.out.println("---------------------");
			System.out.println("1.Борлуулагч нэмэх");
			System.out.println("2.Борлуулагч хасах");
			System.out.println("3.Борлуулалтын түүхийг харах");
			System.out.println("4.Хамгийн их борлуулалт хийсэн");
			System.out.println("5.Хамгийн бага борлуулалт хийсэн");
			System.out.println("6.Дуусгах");
			int b = sc.nextInt();
			switch (b) {
		    case 1:
		        System.out.println("Борлуулагчийн нэр:");
		        sc.nextLine(); // Consume newline character
		        String name = sc.nextLine();
		        System.out.println("Борлуулалтын тоо:");
		        int number = sc.nextInt();
		        B newB = new B(name, number);
		        blist.add(newB);
		        System.out.println("Борлуулагч амжилттай нэмэгдлээ");
		        break;
		    case 2:
		        if (blist.size() == 0) {
		            System.out.println("Хоосон байна");
		        } else {
		            System.out.println("Устгах борлуулагчийн индекс:");
		            int indexToDelete = sc.nextInt();
		            blist.remove(indexToDelete);
		            System.out.println("Борлуулагч амжилттай устгагдлаа");
		        }
		        break;
		    case 3:
		        System.out.println("Борлуулалтын түүх");
		        for (int i = 0; i < blist.size(); i++) {
		            B bObj = blist.get(i);
		            System.out.println((i + 1) + ". Нэр:" + bObj.getname() + " Борлуулалтын тоо:" + bObj.getnumber());
		        }
		        break;
		    case 4:
		        if (blist.size() == 0) {
		            System.out.println("Хоосон байна");
		        } else {
		        	int highestNumber =0;
		            for (int i = 0; i < blist.size(); i++) {
		                B bObj = blist.get(i);
		                if (bObj.getnumber() > highestNumber) {
		                    highestNumber = bObj.getnumber();
		                }
		            }
		            System.out.println("Хамгийн их борлуулалтын тоо: " + highestNumber);
		        }
		        break;
		    case 5:
		        if (blist.size() == 0) {
		            System.out.println("Хоосон байна");
		        } else {
		        	int lowestNumber = 0;
		           // int lowestNumber = Integer.MAX_VALUE;
		            for (int i = 0; i < blist.size(); i++) {
		                B bObj = blist.get(i);
		                if (bObj.getnumber() < lowestNumber) {
		                    lowestNumber = bObj.getnumber();
		                }
		            }
		            System.out.println("Хамгийн бага борлуулалтын тоо: " + lowestNumber);
		        }
		        break;
		    case 6:
		        System.exit(0);
		        break;
		    default:
		        System.out.println("Зөв утга оруулна уу.");
		        break;
				}
			}
			
		}

	}
	 class B{
		private String name;
		private int number;
		
		public B(String name,int number) {
			this.name = name;
			this.number = number;
		}
		public String getname() {
			return name;
		}
		public int getnumber() {
			return number;
		}
	}


