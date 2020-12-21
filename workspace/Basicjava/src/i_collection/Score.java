package i_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450		
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00	
		 */
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("정지수"); names.add("이현기"); names.add("윤지혜"); names.add("정이삭"); names.add("박세현"); 
		names.add("오세일"); names.add("장병길"); names.add("배수진"); names.add("김지훈"); names.add("임태준"); 
		names.add("최희수"); names.add("전형섭"); names.add("김혜정"); names.add("송수미"); names.add("진예은"); 
		names.add("양지수"); names.add("김도윤"); names.add("김보현"); names.add("원정훈"); names.add("문선준"); 
		names.add("진유리"); names.add("김동익"); names.add("이진수"); names.add("박초원"); names.add("김보미"); 

		ArrayList<String> subjects = new ArrayList<>();
		
		subjects.add("국어"); subjects.add("영어"); subjects.add("수학"); subjects.add("사회"); subjects.add("과학"); 
		subjects.add("Oracle"); subjects.add("Java"); subjects.add("합계"); subjects.add("평균"); subjects.add("석차"); 
		
		
		//점수
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		
		for(int i = 0; i < names.size(); i++){
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < subjects.size(); j++){
				score.add((int)(Math.random() * 101));
			}
			scores.add(score);
		}
		
		//합계,평균
				ArrayList<Integer> sums = new ArrayList<>();
				ArrayList<Double> avgs = new ArrayList<>();
				
				for(int i = 0; i < names.size(); i++){
					int sum = 0;
					for(int j = 0; j < subjects.size(); j++){
						sum += scores.get(i).get(j);
					}
					double avg = Math.round((double)sum / subjects.size() * 100) / 100.0;
					sums.add(sum);
					avgs.add(avg);
		}
		//석차
				ArrayList<Integer> ranks = new ArrayList<>();
				
				for(int i = 0; i < sums.size(); i++){
					ranks.add(1);
					for(int j = 0; j < sums.size(); j++){
						if(sums.get(i) < sums.get(j)){
							ranks.set(i, ranks.get(i) + 1);
						}
					}
				}
				
		//정렬
				for (int i = 0; i < ranks.size() - 1; i++) {
					int min = i;
					for (int j = i + 1; j < ranks.size(); j++) {
						if (ranks.get(j) < ranks.get(min)) {
							min = j;
						}
					}
					
					String name = names.get(i);
					names.set(i, names.get(min));
					names.set(min, name);
					
					ArrayList<Integer> list = scores.get(i);
					scores.set(i, scores.get(min));
					scores.set(min, list);
					
					Integer sum = sums.get(i);
					sums.set(i, sums.get(min));
					sums.set(min, sum);
					
					Double avg = avgs.get(i);
					avgs.set(i, avgs.get(min));
					avgs.set(min, avg);
					
					int rank = ranks.get(i);
					ranks.set(i, ranks.get(min));
					ranks.set(min, rank);
				}
				
		//출력
				for(int i = 0; i < subjects.size(); i++){
					System.out.print("\t" + subjects.get(i));
				}
				System.out.println("\t합계\t평균\t석차");
				
				for(int i = 0; i < names.size(); i++){
					System.out.print(names.get(i) + "\t");
					for(int j = 0; j < subjects.size(); j++){
						System.out.print(scores.get(i).get(j) + "\t");
					}
					System.out.print(sums.get(i) + "\t");
					System.out.print(avgs.get(i) + "\t");
					System.out.print(ranks.get(i) + "\t");
					System.out.println();
				}
				
				//과목합계/과목평균
				ArrayList<Integer> subjectSums = new ArrayList<>();
				ArrayList<Double> subjectAvgs = new ArrayList<>();
				for(int i = 0; i < subjects.size(); i++){
					int sum = 0;
					for(int j = 0; j < names.size(); j++){
						sum += scores.get(j).get(i);
					}
					double avg = Math.round((double)sum / names.size() * 100) / 100.0;
					subjectSums.add(sum);
					subjectAvgs.add(avg);
				}
				
				System.out.print("과목합계");
				for(int i = 0; i < subjectSums.size(); i++){
					System.out.print("\t" + subjectSums.get(i));
				}
				System.out.println();
				System.out.print("과목평균");
				for(int i = 0; i < subjectAvgs.size(); i++){
					System.out.print("\t" + subjectAvgs.get(i));
				}
				System.out.println();
			}

		}
		
	

		
