package com.sdc.android.quickask.sql;

public class DatabaseSchema {

    public static final String DATABASE_NAME = "questions_and_responses.db";

    public static final String DATABASE_QUESTIONS_TABLE_NAME = "questions";
    public static final String DATABASE_RESPONSES_TABLE_NAME = "responses";

    public static final int DATABASE_VERSION = 1;

    public static final class QuestionsCols{

        public static final String QUESTION_UUID = "question_uuid";
        public static final String QUESTION_TEXT = "question_text";
        public static final String QUESTION_DESCRIPTION = "question_description";
        public static final String USER = "question_poster";
        public static final String QUESTION_SCORE = "question_score";
        public static final String POST_DATE = "post_date";
        public static final String RESPONSE_DEADLINE = "response_deadline";

    }

    public static final class ResponsesCols{

        public static final String RESPONSE_UUID = "response_uuid";
        public static final String QUESTION_UUID = "question_uuid";
        public static final String RESPONSE_TEXT = "response_text";
        public static final String POST_DATE = "post_date";
        public static final String RESPONSE_SCORE = "response_score";
        public static final String USER = "response_poster";

    }

}
