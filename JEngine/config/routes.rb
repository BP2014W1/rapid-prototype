Rails.application.routes.draw do
   #get 'welcome/index'

   resources :overview
   resources :task	

   # You can have the root of your site routed with "root"
   root 'welcome#index'
end
