package fishsim;

import java.util.List;

public class Shark extends Predator {
        
        public Shark(Cell cell, FishParams params)
        {
            super(cell, params);
            status = 3;
        }
        
        public Fish spawn(Cell cell)
        {
            return cell.createFish("shark");
        }

		@Override
		public void eat(List<Cell> neighborhood) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAlive() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void move(Cell current, List<Cell> neighborhood) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void breed(List<Cell> neighborhood) {
			// TODO Auto-generated method stub
			
		}
}
