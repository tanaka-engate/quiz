package com.example.service;

import java.util.Optional;

import com.example.entity.Quiz;

//Quizサービス処理：Service
public interface QuizService {
	//クイズ情報を全件取得します
	Iterable<Quiz> selectAll();

	//	クイズ情報を、idをキーに１件取得します
	//	 selectOneRandomQuiz()は勝手につけた名前
	Optional<Quiz> selectOneRandomQuiz();

	//	クイズの正解・不正解を判定します
	Boolean checkQuiz(Integer id, Boolean myAnswer);

	//	クイズを登録する
	void insertQuiz(Quiz quiz);

	//クイズを更新します
	void updateQuiz(Quiz quiz);

	//	クイズを削除します
	void deleteQuizById(Integer id);

	Optional<Quiz> selectOneById(Integer id);

	void deleteAllQuiz();

}
