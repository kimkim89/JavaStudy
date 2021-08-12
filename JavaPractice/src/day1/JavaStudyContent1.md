JAVA STUDY – DAY1 

목표: 자바 소스 파일(.java)을 JVM으로 실행하는 과정 이해하기

1. JVM이란 무엇인가?
   JVM(=Java Virtual Machine) : 자바 가상 머신
	- 자바 실행 머신
	- 시스템 메모리를 관리하면서 자바 기반 애플리케이션을 위해 이식 가능한 실행 환경을 제공
	- 한번 작성하면, 어디서든 실행(Write once, run anywhere)
	- JVM 덕분에 자바로 작성된 프로그램을 수정하지 않고도 여러가지 운영체제에서 사용 가능


	스프링 프레임워크, 스프링 부트 reference 참고 시 최소 자바 8버전 이상부터 사용 가능하도록 되어 있음 
		→ 컴파일할 때 옵션을 줬기 때문에 가능
		→ Library와 Framework를 제공할 경우 javac 옵션을 필수적으로 알아야함


2.	컴파일 하는 방법 및 실행하는 방법
	자바 14버전으로 Hello.java라는 파일을 컴파일 할 경우, Hello.class라는 파일로 변환됨

   [Questions]
	Q1: 자바 14버전으로 컴파일한 Hello.class를 자바 8버전으로 실행할 경우? 
	A1: 상위 버전의 바이트코드는 하위 버전의 자바 프로그램을 실행할 수 없음. 
		하지만, 자바 8버전의 클래스를 상위 자바 버전으로 컴파일할 수 있음.
		*만약 자바 컴파일할 때 javac 옵션을 준다면 호환 가능
		→ javac 옵션: -source, -target 

   [Practice1] 자바 11버전으로 컴파일: Hello.java → Hello.class
   *important : Hello.java 파일에 package가 지정되어 있다면 package가 지정된 상위 폴더에서 실행
  → java package명.파일이름

<img src="https://user-images.githubusercontent.com/67870203/129137326-b587bddf-c5cf-4f36-9866-7dcfa985efc4.png"/>
<img src="https://user-images.githubusercontent.com/67870203/129140613-d33b05fd-bb49-4615-af65-a88b93d32d62.png"/>
	
   [Practice2] 자바 11버전으로 컴파일 하면서 javac option인 -source와 -target을 사용하여 자바 1.8 버전에서도 호환되도록 함	
<img src="https://user-images.githubusercontent.com/67870203/129140688-01586a09-093a-426e-94bd-3ae0d02f6e3a.png">   
   
   
	참고 사이트1: https://as-i-am-programing.tistory.com/2 
	참고 사이트2: https://gocoder.tistory.com/1491


3.	바이트코드란 무엇인가?
   - Java Class 파일 안에 들어있음

   [Practice3] 바이트코드를 javap라는 명령어로 보면 우리가 읽을 수 있는 형태로 해석해서 보여줌
   *노란색 박스: OP코드 = Operation Code 
 → 하나의 바이트로 만들어져 있음 (하나의 바이트니까 28=256개 만들 수 있음)
 → 대략 200개의 명령어가 있음 (ex: getstatic, ldx, invokevirtual 등)
   *OP코드가 0: getstatic / 3: ldx / 5: invokevirtual / 8: return 처럼 텍스트로 보이는 이유: javap -c 옵션을 사용해서 해석됨 

<img src="https://user-images.githubusercontent.com/67870203/129140721-f2b8a0ba-d2f9-402f-95e5-22c1e27ad5ae.png" />



4.	JIT 컴파일러란 무엇이며 어떻게 동작하는지?
자바를 사용해서 실행할 때 필요함


5.	JVM 구성 요소



6.	JDK와 JRE의 차이
