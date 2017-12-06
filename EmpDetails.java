
public class EmpDetails {

		private int id;
		private String name;
		private long mob;
		public EmpDetails(int id, String name, long mob) {
			this.id = id;
			this.name = name;
			this.mob = mob;
		}
		@Override
		public String toString() {
			
			return "id: "+id+ " name "+ name + " Mob: "+ mob;
		}
}
