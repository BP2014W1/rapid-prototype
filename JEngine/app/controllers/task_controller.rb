class TaskController < ApplicationController
  def new
	puts 'viewing index'
  end
  def done
	puts 'done editing'
  end
  def completed
      cookie_id = cookies[:cookie_id]
      task_id = params[:task_id]
      puts "finished task: cookie  task_id= #{task_id} cookie_id= #{cookie_id}"
      
      redirect_to :action => 'done'
  end
end
