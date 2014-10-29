class WelcomeController < ApplicationController
  def index
	if cookies[:is_active] 
		show_cookies	
	else	
		set_cookies
	end
  end
  def set_cookies
    cookies[:user_name]   = "Horst Meier" 
    cookies[:customer_number] = "1234567890" 
  end
  
  def show_cookies
    @user_name    = cookies[:user_name]
    @customer_number = cookies[:customer_number]
  end
  
  def delete_cookies
    cookies.delete :user_name
    cookies.delete :customer_number
  end
end
