



public class Ex2{
	

		public static void main(String[] args) {
			
			System.out.println("Suponha que uma faculdade tenha três disciplinas diferentes de BANCOS "
							+ "DE DADOS (SQL, NoSQL, GIS), quatro disciplinas diferentes de\r\n"
							+ "PROGRAMAÇAO (Python, Java, Ce PHP) e duas disciplinas diferentes de\r\n"
							+ "ENG. DE SOFTWARE (Métodos ágeis, Processos de Software).");
			
			System.out.println("\n\n(a) O número m de maneiras que um estudante pode escolher uma de\r\n"
					+ "cada tipo de disciplina é: ");
			
			int BD=3,PROG=4,ENGSOFT=2;
			int resultadoA=1;
			int a = 0; // Pra numerar a listagem
			int b = 0; // Pra numerar a listagem
			int c = 0; // Pra numerar a listagem
			int d = 0; // Pra numerar a listagem
			
			String[] BANCO = {"SQL","NoSQL","GIS"};
	        String[] PROGRAMACAO = {"Python", "Java", "C", "PHP"};
	        String[] ENGSOFTWARE = {"Métodos ágeis", "Processos de Software"};
			String[] SAFADAO = {"Românticas","Antigas", "Carvanal", "Modernas"};
			String[] CALCINHAPRETA = {"Nacional","Internacional"};
			
			resultadoA=BD*PROG*ENGSOFT;
			System.out.println("\n"+resultadoA+" maneiras diferentes(Regra do produto)");
			System.out.println("\nPodendo ser uma disciplina de Banco de dados E uma disciplina de Programação E mais uma disciplina de"
					+ " Engenharia de Software\n");

			for(String i:BANCO) {
				
				
		
				
				for(String j:PROGRAMACAO) {
 					
					
					for(String k:ENGSOFTWARE) {
						
						a++;
						System.out.print(a+".Combinação: "+i+", ");
						
						System.out.print(j+", ");
						System.out.println(k);
						
						}
					}
				
			
 				
			}
					
 				
 				
			
				
				
				
			
			
				
			
				
			
			
			
			
			
			System.out.println("\n\n\n(b)O número n de maneiras que um estudante pode escolher apenas uma\r\n"
					+ "disciplina é: ");
			
			
			
			int resultadoB=BD+PROG+ENGSOFT;
			
			System.out.println("\n"+resultadoB+" maneiras diferentes(Regra da soma)");
			System.out.println("\nPodendo ser uma disciplina de Banco de dados OU uma disciplina de Programação OU mais uma disciplina de"
					+ " Engenharia de Software");
			
			for(String i:BANCO) {
				b++;
				System.out.println(b+".Escolha: "+i);
			}
			
			for(String j:PROGRAMACAO) {
				b++;
				System.out.println(b+".Escolha: "+j);
			}
			
			for(String k:ENGSOFTWARE) {
				b++;
				System.out.println(b+".Escolha: "+k);
			}
			
			
			
			
			
			System.out.println("\n\nExemplo Extra(Shows): ");
			
			for(String i:SAFADAO) {
				
				
		
				
				for(String j:CALCINHAPRETA) {
 					
					
						
						c++;
						System.out.print(c+".Combinação: "+i+", ");
						
						System.out.println(j);
						
						
						
					}
			}
			
			System.out.println("\n");
			for(String i:SAFADAO) {
					d++;
					System.out.println(d+".Escolha: "+i);
				}
				
			for(String j:CALCINHAPRETA) {
					d++;
					System.out.println(d+".Escolha: "+j);
				}	
	}
}