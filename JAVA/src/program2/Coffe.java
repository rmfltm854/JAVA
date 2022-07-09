package program2;

public class Coffe {
	
	private String coffeName;
	
	public Coffe(String coffeName) {
		this.coffeName = coffeName;
	}

	public String getCoffeName() {
		return coffeName;
	}

	public void setCoffeName(String coffeName) {
		this.coffeName = coffeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coffeName == null) ? 0 : coffeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffe other = (Coffe) obj;
		if (coffeName == null) {
			if (other.coffeName != null)
				return false;
		} else if (!coffeName.equals(other.coffeName))
			return false;
		return true;
	}
	

}
