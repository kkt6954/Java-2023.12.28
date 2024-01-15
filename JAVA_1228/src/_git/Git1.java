package _git;

public class Git1 {

	// 1. Git
	// - 버전 관리 소프트웨어(시스템)
	// : 변경 사항 추적, 백업 및 보안, 협업 용이성
	
	//  1) working directory
	// : 개인 작업 환경(add)
	//  2) staging area
	// : 저장소에서 업데이트하려는 변경사항을 모아두는 곳(commit)
	//  3) local repository
	// : 개인 PC에 저장되는 저장소(push)
	//  4) remote repository(원격 디렉토리)
	// : 다른 개발자와 공유하는 저장소(pull)
	
	// 2. GitHub
	// - Git을 사용하는 프로젝트를 지원하는 웹 호스팅 서비스
	// - git push와 git pull 명령어를 사용하여
	//	: 로컬 리포지토리의 원격 리포지토리 간의 동기화
	
	// 3. Git 설치
	// : Git 공식 웹사이트 - 운영체제에 맞는 버전을 다운로드
	
	// 4. 사용자 이름 및 이메일 설정
	// : commit에 사용자 정보를 기록하는데 사용
	
	// 자격증명 > windows 자격증명 관리자 > 일반 자격 증명(git, sourcetree이 타인의 것 -삭제)
	
	// - 브라우저에서 GitHub 로그인 상태 확인
	
	// MacOS(터미널), Windows(cmd)
//	git config --global user.name (깃허브아이디)
//	git config --global user.email (깃허브이메일)
	
	// - 등록 확인
//	git config --global user.name
//	git config --global user.email
	
	// 5. 리포지토리 초기화 및 기본 운영
//		a. 리포지토리 초기화(init)
//		: 새로운 Git 리포지토리 생성을 위해 git init 명령어 사용
//		: 새로운 Git 리포지토리를 초기화하고 새로운 .git 디렉토리를 생성
	
//		b. 상태 확인(status)
//		: 리포지토리의 현재 상태 확인
//		: 업로드(push)하지 않은 파일이 있는지 확인
//		: git status 명령어 사용
	
//		c. 파일 추가(add)
//		: git add .
//		: 마침표는 전체 변경 사항을 모두 업로드
	
//		d. 커밋(commit)
//		: 변경 사항을 리포지토리에 기록하기 위한 명령어
//		: git commit -m "커밋 메세지-코드에 대한 설명"
	
//		e. 코드 푸쉬(push)
//		: 로컬 리포지토리에서 변경사항을 원격 리포지토리에 저장
//		: git push origin main
	
		//===================================================//
//		원격 리포지토리(깃허브) 연결

//		>> 연동 전 해당 리포지토리의 파일을 받아줄 폴더에
//		>> 리포지토리 초기화(init) 실시 : git init
	
//		>> branch 변경(main)
//		>> git branch -M main
	
//		: 로컬 git 리포지토리에서 원격 리포지토리를 연결
//		: GitHub에서 제공하는 URL 사용
//		: git remote add origin 원격리포지토리URL
	
//		: >> 원격 리포지토리에서 파일 당겨오기
//		: git pull origin main

	
	
	
}
