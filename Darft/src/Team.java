
public class Team
	{
		private String name;
		private String position;
		private int receptions;
		private int yards;
		private int tackles;
		private int coachability;
		private int overall;
		public Team (String n, String p, int r, int y, int t, int c, int o)
		{
			name = n;
			position = p;
			receptions = r;
			yards = y;
			tackles = t;
			coachability = c;
			overall = o;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getPosition()
			{
				return position;
			}
		public void setPosition(String position)
			{
				this.position = position;
			}
		public int getReceptions()
			{
				return receptions;
			}
		public void setReceptions(int receptions)
			{
				this.receptions = receptions;
			}
		public int getYards()
			{
				return yards;
			}
		public void setYards(int yards)
			{
				this.yards = yards;
			}
		public int getTackles()
			{
				return tackles;
			}
		public void setTackles(int tackles)
			{
				this.tackles = tackles;
			}
		public int getCoachability()
			{
				return coachability;
			}
		public void setCoachability(int coachability)
			{
				this.coachability = coachability;
			}
		public int getOverall()
			{
				return overall;
			}
		public void setOverall(int overall)
			{
				this.overall = overall;
			}
		
	}