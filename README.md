Go to your job → Configure

Check ✅ “Discard old builds”

Set:

Max # of builds to keep → e.g., 10

or Days to keep builds → e.g., 7

Click Save.

Jenkins will automatically purge older builds during new runs.

🧩 4️⃣ Plugin option (if delete button missing)

If the Delete Build option doesn’t appear in UI:

Go to Manage Jenkins → Plugins → Available

Search for: “Delete Builds”

Install it and restart Jenkins
Now the “Delete Build” button will show for each build.

✅ Example Cleanup Commands Summary
Method	Command / Path	Notes
UI (single)	Job → Build → “Delete Build”	Easy & safe
UI (auto)	Job → Configure → “Discard old builds”	Set once, automatic cleanup
CLI	/var/lib/jenkins/jobs/<job>/builds/<#>	Manual delete via shell
Plugin	Install “Delete Builds”	Adds button if missing
