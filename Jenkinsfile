pipeline {
    agent any
    environment {
        IS_READ_NEV_VARABLES = 'true'
	DB_NAME = 'my_sql_db'
    }
    stages {
        stage('print_variables') {
            steps {
                echo env.IS_READ_NEV_VARABLES
		echo env.DB_NAME
            }
        }
    }
}
