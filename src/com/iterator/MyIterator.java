package com.iterator;

/**
 * �Զ���ĵ������ӿ�
 * @author Administrator
 *
 */
public interface MyIterator {
	void first(); //���α�ָ���һ��
	void next(); //���α�ָ����һ��
	boolean hasNext(); //�ж��Ƿ������һ��Ԫ��
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj(); //��ȡ��ǰ�α�ָ��Ķ���
}