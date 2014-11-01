class UpdateV2 < ActiveRecord::Migration
  def change
	change_column :activities, :a_type, :string
	change_column :stages, :skipped, :text
	change_column :activities, :open, :text
	change_column :activities, :completed, :text
	change_column :activities, :enabled, :text

	drop_table :backgrounds
	drop_table :pcms
  end
end