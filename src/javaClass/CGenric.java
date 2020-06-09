/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CGenric<E,K,V,N,T> implements IGenric<E,K,V,N,T>{

	public static final String NAME ="CGenric";
	public E e;
	public K k;
	public V v;
	public N n;
	public T t;
		
	/**
	 * 
	 */
	public CGenric() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param e
	 * @param k
	 * @param v
	 * @param n
	 * @param t
	 */
	public CGenric(E e, K k, V v, N n, T t) {
		//super();
		this.e = e;
		this.k = k;
		this.v = v;
		this.n = n;
		this.t = t;
	}


	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public N getN() {
		return n;
	}

	public void setN(N n) {
		this.n = n;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public E getE() {
		return e;
	}
	
	public void setE(E e) {
		this.e = e;
	}

	public void setK(K k) {
		this.k = k;
	}

	public K getK() {
		return k;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" , "+e+" , "+k+" , "+v+" , "+n+" , "+t;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + ((k == null) ? 0 : k.hashCode());
		result = prime * result + ((n == null) ? 0 : n.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		result = prime * result + ((v == null) ? 0 : v.hashCode());
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
		CGenric other = (CGenric) obj;
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (k == null) {
			if (other.k != null)
				return false;
		} else if (!k.equals(other.k))
			return false;
		if (n == null) {
			if (other.n != null)
				return false;
		} else if (!n.equals(other.n))
			return false;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		if (v == null) {
			if (other.v != null)
				return false;
		} else if (!v.equals(other.v))
			return false;
		return true;
	}


	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Log(Object s) {
		// TODO Auto-generated method stub
		CLog.Log(NAME+":"+s);
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}



}
