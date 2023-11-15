package com.example.form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizForm {
	//識別ID
	private Integer id;
	//	クイズの内容
	@NotBlank
	private String question;
	//	クイズの解答
	@NotBlank
	private Boolean Answer;
	//	作成者
	@NotBlank
	private String Author;
	//	登録or変更判定用
	private Boolean newQuiz;
}
