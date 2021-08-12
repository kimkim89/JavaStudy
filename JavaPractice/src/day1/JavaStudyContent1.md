JAVA STUDY – DAY1   

목표: 자바 소스 파일(.java)을 JVM으로 실행하는 과정 이해하기  

1. JVM이란 무엇인가?  

	   JVM(=Java Virtual Machine) : 자바 가상 머신  
		- 자바 실행 머신  
		- 시스템 메모리를 관리하면서 자바 기반 애플리케이션을 위해 이식 가능한 실행 환경을 제공  
		- 한번 작성하면, 어디서든 실행(Write once, run anywhere)  
		- JVM 덕분에 자바로 작성된 프로그램을 수정하지 않고도 여러가지 운영체제에서 사용 가능  
		→ Java compiler가 .java파일을 .class라는 bytecode로 변환  
		→ bytecode는 기계어가 아니므로 OS에서 바로 실행이 되지 않지만, JVM에 의해 OS 상관없이 실행됨   
	

	스프링 프레임워크, 스프링 부트 reference 참고 시 최소 자바 8버전 이상부터 사용 가능하도록 되어 있음 
		→ 컴파일할 때 옵션을 줬기 때문에 가능
		→ Library와 Framework를 제공할 경우 javac 옵션을 필수적으로 알아야함


2.	컴파일 하는 방법 및 실행하는 방법  
	자바 14버전으로 Hello.java라는 파일을 컴파일 할 경우, Hello.class라는 파일로 변환됨  

   [Questions]  
	Q1: 자바 14버전으로 컴파일한 Hello.class를 자바 8버전으로 실행할 경우?   
	A1: 상위 버전의 바이트코드는 하위 버전의 자바 프로그램을 실행할 수 없음.   
		하지만, 자바 8버전의 클래스를 상위 자바 버전으로 컴파일할 수 있음.   
			→ ex: java.lang.UnsupportedClassVersionError: Hello has been compiled by a more recent version of the Java Runtime…    
		만약 자바 컴파일할 때 javac 옵션을 준다면 호환 가능  
		→ javac 옵션: -source(소스파일 자바 버전 지정), -target(타켓파일 자바 버전 지정)    

   [Practice1] 자바 11버전으로 컴파일: Hello.java → Hello.class  
   -> important : Hello.java 파일에 package가 지정되어 있다면 package가 지정된 상위 폴더에서 실행  
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
     
   	노란색 박스: OP코드 = Operation Code
   -> 하나의 바이트로 만들어져 있음 (하나의 바이트니까 28=256개 만들 수 있음)  
 -> 대략 200개의 명령어가 있음 (ex: getstatic, ldx, invokevirtual 등)  
   	OP코드가 0: getstatic / 3: ldx / 5: invokevirtual / 8: return 처럼 텍스트로 보이는 이유: javap -c 옵션을 사용해서 해석됨   

<img src="https://user-images.githubusercontent.com/67870203/129140721-f2b8a0ba-d2f9-402f-95e5-22c1e27ad5ae.png" />



4.	JIT 컴파일러란 무엇이며 어떻게 동작하는지?  
  	- 자바를 사용해서 실행할 때 필요함  
  	- 반복되는 코드가 있다면 그 코드를 JIT 컴파일러가 기계어로 변환해서 캐싱 해놓고 재사용하면서 반복되던 코드를 인터프리터가 재해석할 필요가 없어져서 속도가 빨라짐  
  	- JIT컴파일러는 일종의 스레드로 인터프리터와 동시에 동작  
  	- JIT컴파일러는 JVM의 RUNTIME영역에 들어있음  

5.	JVM 구성 요소
  (1) Class Loader  
	- 클래스 파일을 로딩하는 역할(bytecode 실행될 때 class 객체를 메모리에 생성함)  
	- 필요할 때마다 동적으로 클래스 파일을 로딩함  
	- Loading(클래스 읽기) → Linking(레퍼런스 연결) → Initialization(초기화) 단계로 동작  
	- Runtime 단계에서 컴파일된 자바 바이트코드를 Execution Engine이 실행하면서 Runtime Data Area에 로드함  
			
	[Class Loader 종류]  
	①	부트스트랩 클래스 로드: 자바 API 로드  
	②	익스텐션 클래스 로드: 기본 자바 API를 제외한 확장 API 로드  
	③	시스템 클래스 로드: CLASSPATH에 정의된 클래스 로드  
	④	사용자 정의 클래스: 개발자가 직접 코드상에 생성한 클래스 로드  

  (2) Execution Engine
	- .class파일을 실행시키는 역할  
	- 메서드를 실행하는 실행 엔진  
	- Class Loader가 JVM Runtime에 bytecode 올린 후 Execution Engine이 해당 bytecode 실행함  
	- 실행 엔진은 bytecode를 명령어 단위로 읽어서 실행  
	
	[실행 방식]
	① Interpreter : 한 줄씩 해석 후 실행, 속도 느림
	② JIT Compiler : bytecode를 nativecode로 변경 후 실행, 실행 속도 빠름

  (3) Runtime Data Area  
	- JVM이 프로그램 수행을 위해 OS로부터 할당 받는 메모리 영역     
	
		[Runtime Data Area 종류]  
	①	PC Register :   
		- 스레드에 실행될 명령어 기록하는 부분
		- 현재 수행 중인 JVM 명령의 주소를 저장
		- 스레드마다 하나씩 생성   
	②	JVM Stack :  
		- Stack Frame 구조체 저장
		- 스레드의 메서드가 호출될 때 수행 정보(메서드 호출 주소, 매개변수, 지역변수, 연산 스택)가 프레임 단위로 JVM Stack에 저장됨
		- 메서드 호출 종료되면 Stack에서 제거됨
		- 스레드마다 하나씩 생성   
	③	Native Method Stack :  
		- Java 언어 외 다른 언어로 작성된 네이티브 코드를 위한 Stack
		- 스레드마다 하나씩 생성  
	④	Heap:   
		- 모든 객체와 그것들과 연관된 인스턴스 그리고 배열들이 동적으로 저장되는 메모리 영역
		- GC가 Heap 메모리 영역 관리해줌
		- 모든 스레드가 공유(GC 대상 영역)   
	⑤	Method Area :   
		- JVM에 의해 읽어진 모든 클래스와 인터페이스에 대한 런타임 상수 풀, 필드, 메서드 코드 ,정적 변수, 메서드의 바이트코드 등이 보관됨 
		- 모든 스레드가 공유(GC 대상 영역)  			
	*GC(Garbage Collector) :   
		- 더 이상 참조되지 않는 메모리를 자동으로 정리해줌
	
	[각 영역에 저장되는 값]
	 1)	메서드 영역: 클래스, 메서드, 클래스 변수(static), 전역변수
	 2)	힙 영역: new 연산자를 통해 생성된 객체(인스턴스)
	 3)	스택 영역: 지역변수, 매개변수, 리턴값, 참조변수
	
참고사이트1: https://coding-nyan.tistory.com/87  
참고사이트2: https://justin-g.tistory.com/56  
참고사이트3: https://www.guru99.com/java-virtual-machine-jvm.html   
참고사이트4: https://medium.com/@lazysoul/jvm-%EC%9D%B4%EB%9E%80-c142b01571f2   
참고사이트5: https://jithub.tistory.com/40   
참고사이트6: https://poetic-code.tistory.com/118   


6. JDK와 JRE의 차이  
  (1) JDK(Java Development Kit) : 자바 개발 도구, 자바 언어로 프로그램 개발 시 설치 필수  
   	- 자바 9버전부터 JRE 따로 배포하지 않고 JDK만 제공함  
	→ javac 명령어: compile함, 개발할 때 필요하므로 JDK에 들어있음  

  (2) JRE(Java Runtime Environment) : 자바 실행 환경, 자바 언어로 작성된 프로그램 실행을 위해 설치  
	- 자바 9버전부터 JRE 더 이상 만들지 않음
