type Stack struct {
	items []string
}

func NewStack() *Stack {
	return &Stack{items: []string{}}
}

func (s *Stack) Push(item string) {
	s.items = append(s.items, item)
}

func (s *Stack) Pop() string {
	lastIndex := len(s.items) - 1
	lastItem := s.items[lastIndex]
	s.items = s.items[:lastIndex]
	return lastItem
}

func (s *Stack) Peek() string {
	lastIndex := len(s.items) - 1
	return s.items[lastIndex]
}

func (s *Stack) Size() int {
	return len(s.items)
}

stack := NewStack()
stack.Push("apple")
stack.Push("banana")
stack.Push("orange")
stack.Pop()
